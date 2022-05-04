package com.org.pqr.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data

public class College {

    @Id
    private int id;
    private String name;
    private String adress;
    private double expendature;

    public double getExpendature() {
        return expendature;
    }

    public void setExpendature(double expendature) {
        this.expendature = expendature;
    }

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
