package domain;

import java.io.Serializable;
import java.util.Objects;

public class DeliveryManDomain implements Serializable{
    private String DMid;
    private String DMname;
    private String DMdeliveryarea;
    private String DMic;
    private String DMage;
    private String DMgender;
    private String DMphone;
    private String DMemail;
    private String DMaccpass;
    private String DMAddress;
    
    public DeliveryManDomain(){
        
    }
    
    public DeliveryManDomain(String DMid){
        this.DMid = DMid;
    }
    
    public DeliveryManDomain(String DMid, String DMname, String DMdeliveryarea, String DMic, String DMage, String DMgender, String DMphone, String DMemail, String DMaccpass, String DMAddress){
        this.DMid = DMid;
        this.DMname = DMname;
        this.DMdeliveryarea = DMdeliveryarea;
        this.DMic = DMic;
        this.DMage = DMage;
        this.DMgender = DMgender;
        this.DMphone = DMphone;
        this.DMemail = DMemail;
        this.DMaccpass = DMaccpass;
        this.DMAddress = DMAddress;
    }

    public String getDMid() {
        return DMid;
    }

    public String getDMname() {
        return DMname;
    }

    public String getDMdeliveryarea() {
        return DMdeliveryarea;
    }

    public String getDMic() {
        return DMic;
    }

    public String getDMage() {
        return DMage;
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

    public void setDMid(String DMid) {
        this.DMid = DMid;
    }

    public void setDMname(String DMname) {
        this.DMname = DMname;
    }

    public void setDMdeliveryarea(String DMdeliveryarea) {
        this.DMdeliveryarea = DMdeliveryarea;
    }

    public void setDMic(String DMic) {
        this.DMic = DMic;
    }

    public void setDMage(String DMage) {
        this.DMage = DMage;
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