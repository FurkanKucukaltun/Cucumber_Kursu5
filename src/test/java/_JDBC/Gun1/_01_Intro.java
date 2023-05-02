package _JDBC.Gun1;

import  org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

/*
    String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        1- bağlantı bilgilerini girdik ve bağlandık
        2- sorguların çalıştırılacağı ortamı açtık
        3- sorguyu 2 nolu ortam üzerinde çalıştırdık
        4- sonuçları gördük
 */

    @Test
    public void test1() throws SQLException {

        String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        Connection connection= DriverManager.getConnection(hostUrl,username,password); // bağlantıya click  1. madde

        // 2. adım -> sql lerin yazılacağı sayfa
        Statement statement = connection.createStatement(); // sorguları çalıştımak için soru gönderme ortamı

        // 3. adım -> sorguyu yazdım ve çalıştırdım
        ResultSet rs=statement.executeQuery("select * from customer"); // sorgu çalıştı sonucu nerde?
        // executeQuery metodunun çıktsı ResultSet olduğu için ResultSet'e eşitledik

        // ilk satırı mı istiyorsun, son satırı mı, 5.satırı mı
        rs.next(); // ilk satıra gitti

        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");
        System.out.println("1. Satırını müşteri adı ve soyadı = "+firstName+" "+lastName);

        rs.next();

        firstName=rs.getString("first_name");
        lastName=rs.getString("last_name");
        System.out.println("1. Satırını müşteri adı ve soyadı = "+firstName+" "+lastName); // 2. satırdaki datayı yazdırdı

        connection.close();
    }
}
