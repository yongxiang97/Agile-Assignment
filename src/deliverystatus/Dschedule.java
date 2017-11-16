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
@Table(name = "DSCHEDULE", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Dschedule.findAll", query = "SELECT d FROM Dschedule d")
    , @NamedQuery(name = "Dschedule.findByAname", query = "SELECT d FROM Dschedule d WHERE d.aname = :aname")
    , @NamedQuery(name = "Dschedule.findByAtime", query = "SELECT d FROM Dschedule d WHERE d.atime = :atime")})
public class Dschedule implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "ANAME")
    private String aname;
    @Id
    @Basic(optional = false)
    @Column(name = "ATIME")
    private String atime;

    public Dschedule() {
    }

    public Dschedule(String atime) {
        this.atime = atime;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        String oldAname = this.aname;
        this.aname = aname;
        changeSupport.firePropertyChange("aname", oldAname, aname);
    }

    public String getAtime() {
        return atime;
    }

    public void setAtime(String atime) {
        String oldAtime = this.atime;
        this.atime = atime;
        changeSupport.firePropertyChange("atime", oldAtime, atime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atime != null ? atime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dschedule)) {
            return false;
        }
        Dschedule other = (Dschedule) object;
        if ((this.atime == null && other.atime != null) || (this.atime != null && !this.atime.equals(other.atime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deliverystatus.Dschedule[ atime=" + atime + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
