package domain;

import java.io.Serializable;
import java.util.Objects;

public class DeliveryManDomain implements Serializable{
    private String DMid;
    private String DMname;
    private String DMic;
    private String DMgender;
    private String DMphone;
    private String DMemail;
    private String DMaccpass;
    private String DMAddress;
    private String DMStatus;
    private String DMdelivery;
    private String DMOrderID;
    
    public DeliveryManDomain(){
        
    }
    
    public DeliveryManDomain(String DMid){
        this.DMid = DMid;
    }
    
    public DeliveryManDomain(String DMid, String DMname, String DMic, String DMgender, String DMphone, String DMemail, String DMaccpass, String DMAddress, String DMStatus, String DMdelivery, String DMorderID){
        this.DMid = DMid;
        this.DMname = DMname;
        this.DMic = DMic;
        this.DMgender = DMgender;
        this.DMphone = DMphone;
        this.DMemail = DMemail;
        this.DMaccpass = DMaccpass;
        this.DMAddress = DMAddress;
        this.DMStatus = DMStatus;
        this.DMdelivery = DMdelivery;
        this.DMOrderID = DMorderID;
    }

    public String getDMOrderID() {
        return DMOrderID;
    }

    public String getDMdelivery() {
        return DMdelivery;
    }

    public String getDMStatus() {
        return DMStatus;
    }

    public String getDMid() {
        return DMid;
    }

    public String getDMname() {
        return DMname;
    }


    public String getDMic() {
        return DMic;
    }


    public String getDMgender() {
        return DMgender;
    }

    public String getDMphone() {
        return DMphone;
    }

    public String getDMemail() {
        return DMemail;
    }

    public String getDMaccpass() {
        return DMaccpass;
    }

    public String getDMAddress() {
        return DMAddress;
    }

    public void setDMOrderID(String DMOrderID) {
        this.DMOrderID = DMOrderID;
    }
    
    public void setDMStatus(String DMStatus) {
        this.DMStatus = DMStatus;
    }

    public void setDMid(String DMid) {
        this.DMid = DMid;
    }

    public void setDMname(String DMname) {
        this.DMname = DMname;
    }


    public void setDMic(String DMic) {
        this.DMic = DMic;
    }

    public void setDMdelivery(String DMdelivery) {
        this.DMdelivery = DMdelivery;
    }


    public void setDMgender(String DMgender) {
        this.DMgender = DMgender;
    }

    public void setDMphone(String DMphone) {
        this.DMphone = DMphone;
    }

    public void setDMemail(String DMemail) {
        this.DMemail = DMemail;
    }

    public void setDMaccpass(String DMaccpass) {
        this.DMaccpass = DMaccpass;
    }

    public void setDMAddress(String DMAddress) {
        this.DMAddress = DMAddress;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DeliveryManDomain other = (DeliveryManDomain) obj;
        if (!Objects.equals(this.DMid, other.DMid)) {
            return false;
        }
        return true;
    }
    
}