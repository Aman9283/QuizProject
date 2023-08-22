/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Aman
 */
public class DBConnection {
    public Connection co;
    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            co= DriverManager.getConnection("jdbc:mysql://localhost:3306/final","root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void main(String[] args){
        DBConnection co= new DBConnection(); 
    }
}
