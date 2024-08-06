package com.mycompany.cadastrodoencas;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ConnectionDb {
   
    private Connection connectDb() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/diseasedatabase";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }
    
   
    
    void insertDisease(String disease) {
            
        try {
                Connection conn = connectDb();
        
                String sql = "INSERT INTO disease (disease_name) VALUES (?)"; 
            
                PreparedStatement psmt = conn.prepareStatement(sql);
                
                psmt.setString(1, disease);
                psmt.executeUpdate();
                
                psmt.close();
                conn.close();
                
            } catch (SQLException ex) {                
                ex.printStackTrace();
            }
    }
    
    
    void insertSymptom(String symptom) {
        
        try {
            
            Connection conn = connectDb();
            String sql = "INSERT INTO symptom (symptom_name) VALUES (?)";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
            
            psmt.setString(1, symptom);
            psmt.executeUpdate();
            
            psmt.close();
            conn.close();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        
        }
    }
    
    void selectDisease(JTable table) {
        
        try {
            
            TableModel tableModel = new DefaultTableModel();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            Connection conn = connectDb();
            
            String sql = "SELECT * FROM disease";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
            
            ResultSet rs = psmt.executeQuery();
            
            model.setRowCount(0);
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String disease = rs.getString("disease_name");

                model.addRow(new Object[]{id, disease});
                    
            }
            
        
        } catch(SQLException ex) {
            
            ex.printStackTrace();
        }
        
         
    }
    
    
    void selectSymptom(JTable table){
        try {
        
            TableModel tableModel = new DefaultTableModel();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            Connection conn = connectDb();
            
            String sql = "SELECT * FROM symptom";
            
            PreparedStatement psmt = conn.prepareStatement(sql);
            
            ResultSet rs = psmt.executeQuery();
            
            model.setRowCount(0);
            
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String symptom = rs.getString("symtpom_name");

                model.addRow(new Object[]{id, symptom});
                    
            }
            
            
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
    
    
    
    }
    
    
    
    
    private Object JOptionPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}


