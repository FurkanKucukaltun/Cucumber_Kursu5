package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBCParent {
    @Test
    public void Soru() throws SQLException {
        ResultSet rs = statement.executeQuery("select city from city");

        rs.last(); // son satıra gider
        System.out.println("son satır şehir adı = " + rs.getString(1));
        
        rs.first(); // ilk satıra gider
        System.out.println("ilk satır şehir adı = " + rs.getString(1));
        
        rs.last();
        int kacinciSatirdayim=rs.getRow(); // kaçıncı satırda olduğumu verir
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

    }
}
