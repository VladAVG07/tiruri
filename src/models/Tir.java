/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tir {
    private int id;
    private Marca marca;
    private Model model;
    private String nrInmatriculare;
    private List<File> poze;
    private File folderPoze;

    public Tir() {
        this.poze = new ArrayList<>();
    }
    
    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public File getFolderPoze() {
        return folderPoze;
    }

    public void setFolderPoze(File folderPoze) {
        this.folderPoze = folderPoze;
    }
    
    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public List<File> getPoze() {
        return poze;
    }

    public void setPoze(List<File> poze) {
        this.poze = poze;
    }

    @Override
    public String toString() {
        return "Tir{" + "id=" + id + ", marca=" + marca + ", model=" + model + ", nrInmatriculare=" + nrInmatriculare + ", poze=" + poze + '}';
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
        final Tir other = (Tir) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
