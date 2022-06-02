/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Marca {
    private int id;
    private String denumire;
    
    public Marca(int id , String denumire) {
        this.id = id;
        this.denumire = denumire;
    }
    
    public String getDenumire() {
        return denumire;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return denumire;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Marca other = (Marca) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
   
}
