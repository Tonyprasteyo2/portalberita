/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tony
 */
public class koneksi {
    public static Connection konek;
    public static Connection dbkonek () {
        try{
            String url="jdbc:mysql://localhost/uasprogram";
            String user = "root";
            String pas ="";
            konek = DriverManager.getConnection(url, user, pas);
//            System.out.println("berhasil");
        }catch(Exception e){
            System.out.println("gagal");
        }
        return konek;
    }
}
