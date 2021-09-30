/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ninad
 */
@Entity
@Table(name = "bookentity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookentity.findAll", query = "SELECT b FROM Bookentity b"),
    @NamedQuery(name = "Bookentity.findById", query = "SELECT b FROM Bookentity b WHERE b.id = :id"),
    @NamedQuery(name = "Bookentity.findByName", query = "SELECT b FROM Bookentity b WHERE b.name = :name"),
    @NamedQuery(name = "Bookentity.findBySubject", query = "SELECT b FROM Bookentity b WHERE b.subject = :subject"),
    @NamedQuery(name = "Bookentity.findByPrice", query = "SELECT b FROM Bookentity b WHERE b.price = :price")})
public class Bookentity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "subject")
    private String subject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;

    public Bookentity() {
    }

    public Bookentity(Integer id) {
        this.id = id;
    }

    public Bookentity(Integer id, String name, String subject, int price) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookentity)) {
            return false;
        }
        Bookentity other = (Bookentity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bookentity[ id=" + id + " ]";
    }
    
}
