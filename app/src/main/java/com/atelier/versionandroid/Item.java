package com.atelier.versionandroid;

public class Item {
     String nom,version;
     int image;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public Item(String nom, String version, int image) {
        this.nom = nom;
        this.version = version;
        this.image = image;
    }
}
