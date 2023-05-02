package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) {

        System.out.print("Aranacak kelimeyi giriniz : ");
        Scanner oku=new Scanner(System.in);
        String aranankelime= oku.next();

        String donenSonuc=exceldenBul(aranankelime);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String exceldenBul (String aranan){
        String donecek="";
        Sheet sheet=null;
        // excelden okuma işlemleri
        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";
        try {
            FileInputStream inputStream=new FileInputStream(path);
            Workbook workbook=WorkbookFactory.create(inputStream);
            sheet=workbook.getSheetAt(0);
        }catch (Exception e){
        }


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if(sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)) {

                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    donecek+=sheet.getRow(i).getCell(j)+" ";
                }
            }
        }
        return donecek;
}
}

