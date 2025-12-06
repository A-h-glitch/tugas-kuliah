/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readisapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Connection conn;

    public static Connection getConnection(){
        if(conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/readis_db";
                String user = "root";
                String pass = ""; // kalau Laragon kosong

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil!");
                
            } catch(Exception e){
                e.printStackTrace();
                System.out.println("Koneksi Gagal!");
            }
        }
        return conn;
    }
}
