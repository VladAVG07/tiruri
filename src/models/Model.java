/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Model {
    private int id;
    private String denumire;
    private Marca marca;
    
    public Model(int id, String denumire , Marca marca) {
        this.id = id;
        this.denumire = denumire;
        this.marca = marca;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getId() {
        return id;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return denumire;
    }
    
    
    
}
