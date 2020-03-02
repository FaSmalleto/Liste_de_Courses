package com.fa.smalleto.liste_de_courses;

import java.io.Serializable;


public class UserModel implements Serializable{

    private String name, hobby, tvChild;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getTvChild() {
        return tvChild;
    }*/

    /*public void setTvChild (String tvChild) {
        this.tvChild = tvChild;
    }*/

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}