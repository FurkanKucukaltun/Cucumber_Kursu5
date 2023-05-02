package _JDBC.Mentoring;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Mentoring_JDBC extends DBUtility {


    @Test
    public void test1() throws SQLException, IOException {

        ResultSet rs = statement.executeQuery("select * from actor");
        ResultSetMetaData rsmd = rs.getMetaData();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("actor1");

        Row row = sheet.createRow(0);

        int count = 0;
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i));
            row.createCell(count).setCellValue(rsmd.getColumnName(i));
            count++;
        }

        System.out.println();
        count = 1;
        int countCell = 0;
        while (rs.next()) {
            row = sheet.createRow(count);
            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                System.out.printf("%-20s", rs.getString(i));
                Cell cell = row.createCell(countCell);
                cell.setCellValue(rs.getString(i));
                countCell++;
            }
            countCell = 0;
            count++;
            System.out.println();
        }
        String newPath = "src/test/java/_JDBC/Mentoring/actor.xlsx";
        FileOutputStream outputStream = new FileOutputStream(newPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }


    @Test
    public void test2() throws SQLException, IOException {

        ResultSet rs = statement.executeQuery("select first_name from actor where first_name like 'A%';");
        ResultSetMetaData rsmd = rs.getMetaData();
        String path = "src/test/java/_JDBC/Mentoring/actor.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.createSheet("actor2");
        Row row = sheet.createRow(0);
        int count = 0;
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i));
            row.createCell(count).setCellValue(rsmd.getColumnName(i));
            count++;
        }
        System.out.println();
        count = 1;

        count = 1;
        int countCell = 0;
        while (rs.next()) {
            row = sheet.createRow(count);
            for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
                System.out.printf("%-20s", rs.getString(i));
                Cell cell = row.createCell(countCell);
                cell.setCellValue(rs.getString(i));
                countCell++;
            }
            countCell = 0;
            count++;
            System.out.println();
        }

        String  newPath = "src/test/java/_JDBC/actor.xlsx";
        FileOutputStream outputStream = new FileOutputStream(newPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

}

