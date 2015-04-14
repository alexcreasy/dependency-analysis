package org.jboss.pnc.model;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * This class represents the combination of an ID and table revision.
 * It is used as the primary key in audit tables.
 *
 */
public class IdRev implements Serializable {

    private static final long serialVersionUID = 0L;

    @Column(name = "id")
    public Integer id;

    @Column(name = "rev")
    public Integer rev;

    public IdRev() {
        
    }

    public IdRev(Integer id, Integer rev) {
        this.id = id;
        this.rev = rev;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public String toString() {
        return "Id: " + id + ", Rev: " + rev;
    }

    /**
     * Hashcode method generated by eclipse
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((rev == null) ? 0 : rev.hashCode());
        return result;
    }

    /**
     * Equals method generated by eclipse
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IdRev other = (IdRev) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (rev == null) {
            if (other.rev != null)
                return false;
        } else if (!rev.equals(other.rev))
            return false;
        return true;
    }
}
