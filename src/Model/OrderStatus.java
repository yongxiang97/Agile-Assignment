/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Win8
 */
public class OrderStatus {

    private String dName;
    private String Dlocation;
    private String Flocation;
    private String dTime;
    private String dDate;


    public OrderStatus(String dName, String Flocation, String Dlocation, String dTime, String dDate) {
        this.dName = dName;
        this.Flocation = Flocation;
        this.Dlocation = Dlocation;
        this.dTime = dTime;
        this.dDate = dDate;
    }

    public OrderStatus() {
    }


    public String getFlocation() {
        return Flocation;
    }

    public void setFlocation(String Flocation) {
        this.Flocation = Flocation;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdTime() {
        return dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }
    
    public String getDlocation() {
        return Dlocation;
    }

    public void setDlocation(String Dlocation) {
        this.Dlocation = Dlocation;
    }


}
