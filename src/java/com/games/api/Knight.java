/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.api;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author briansarsany
 */
@Entity
@XmlRootElement
public class Knight extends Piece implements Serializable {
    public Knight(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
            return false;
        if(toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
            return false;

        return true;
    }    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Knight)) {
            return false;
        }
        Knight other = (Knight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.games.api.Knight[ id=" + id + " ]";
    }
    
}
