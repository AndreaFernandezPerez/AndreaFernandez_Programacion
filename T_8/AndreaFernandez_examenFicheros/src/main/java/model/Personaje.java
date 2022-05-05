package model;

import java.io.Serializable;

public class Personaje implements Serializable {

    //variables
    private String photo, name;

    //constructores
    public Personaje() {
    }

    public Personaje(String photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    //getter y setter

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //método to String


    @Override
    public String toString() {
        return "Personaje{" +
                "photo='" + photo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}// fin de clase
