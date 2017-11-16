package da;

import domain.DeliveryManDomain;
import java.sql.*;
import javax.swing.*;

public class DeliveryManDA{
    private String host = "jdbc:derby://localhost:1527/delivery";
    private String user = "LOL";
    private String password = "LOL";
    private String tableName = "DELIVERYMAN";
    private Connection conn;
    private PreparedStatement stmt;
    
    public DeliveryManDA(){
        createConnection();
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     private void shutDown() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
     
     public void addRecord(DeliveryManDomain DeliveryDomain){
        String insertStr = "INSERT INTO " + tableName + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            stmt = conn.prepareStatement(insertStr);
            stmt.setString(1, DeliveryDomain.getDMid());
            stmt.setString(2, DeliveryDomain.getDMname());
            stmt.setString(3, DeliveryDomain.getDMdeliveryarea());
            stmt.setString(4, DeliveryDomain.getDMic());
            stmt.setString(5, DeliveryDomain.getDMage());
            stmt.setString(6, DeliveryDomain.getDMgender());
            stmt.setString(7, DeliveryDomain.getDMphone());
            stmt.setString(8, DeliveryDomain.getDMemail());
            stmt.setString(9, DeliveryDomain.getDMaccpass());
            stmt.setString(10, DeliveryDomain.getDMAddress());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public String generateStaffID(){
        String GenStr = "SELECT DAID FROM " + tableName + " ORDER BY DAID DESC";
        String stfID = "";
        try{
             stmt = conn.prepareStatement(GenStr);
             ResultSet rs = stmt.executeQuery();
             if(rs.next()){
                 String existID = rs.getString("DAID");
                 int num = Integer.parseInt(existID.substring(1))+1;
                 stfID = String.format("D%03d", num);
                 
             }
             else{
             stfID = "D0010";
             }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return stfID;
    }
     
     public DeliveryManDomain getphnRecord(String DMphone){
        String queryStr = "SELECT * FROM " + tableName + " WHERE DMphone = ?";
        DeliveryManDomain DomainDeliver = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, DMphone);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                DomainDeliver = new DeliveryManDomain(rs.getString("daid"), rs.getString("dmname"), rs.getString("dmdeliveryarea"), rs.getString("dmic"), rs.getString("dmage"), rs.getString("dmgender"), DMphone, rs.getString("dmemail"), rs.getString("dmaccpass"), rs.getString("dmaddress"));
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return DomainDeliver;
    }
     
}

