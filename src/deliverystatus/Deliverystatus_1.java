/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverystatus;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Win8
 */
@Entity
@Table(name = "DELIVERYSTATUS", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Deliverystatus_1.findAll", query = "SELECT d FROM Deliverystatus_1 d")
    , @NamedQuery(name = "Deliverystatus_1.findByDeliid", query = "SELECT d FROM Deliverystatus_1 d WHERE d.deliid = :deliid")
    , @NamedQuery(name = "Deliverystatus_1.findByDeliname", query = "SELECT d FROM Deliverystatus_1 d WHERE d.deliname = :deliname")
    , @NamedQuery(name = "Deliverystatus_1.findByStatus", query = "SELECT d FROM Deliverystatus_1 d WHERE d.status = :status")})
public class Deliverystatus_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DELIID")
    private String deliid;
    @Basic(optional = false)
    @Column(name = "DELINAME")
    private String deliname;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;

    public Deliverystatus_1() {
    }

    public Deliverystatus_1(String deliid) {
        this.deliid = deliid;
    }

    public Deliverystatus_1(String deliid, String deliname, String status) {
        this.deliid = deliid;
        this.deliname = deliname;
        this.status = status;
    }

    public String getDeliid() {
        return deliid;
    }

    public void setDeliid(String deliid) {
        String oldDeliid = this.deliid;
        this.deliid = deliid;
        changeSupport.firePropertyChange("deliid", oldDeliid, deliid);
    }

    public String getDeliname() {
        return deliname;
    }

    public void setDeliname(String deliname) {
        String oldDeliname = this.deliname;
        this.deliname = deliname;
        changeSupport.firePropertyChange("deliname", oldDeliname, deliname);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliid != null ? deliid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deliverystatus_1)) {
            return false;
        }
        Deliverystatus_1 other = (Deliverystatus_1) object;
        if ((this.deliid == null && other.deliid != null) || (this.deliid != null && !this.deliid.equals(other.deliid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deliverystatus.Deliverystatus_1[ deliid=" + deliid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
