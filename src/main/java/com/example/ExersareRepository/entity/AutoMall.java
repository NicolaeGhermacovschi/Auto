package com.example.ExersareRepository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AutoMall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMall;
    private String denMall;
    private String adress;
    private Integer numberAuto;

    public Integer getIdMall() {
        return idMall;
    }

    public void setIdMall(Integer idMall) {
        this.idMall = idMall;
    }

    public String getDenMall() {
        return denMall;
    }

    public void setDenMall(String denMall) {
        this.denMall = denMall;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(Integer numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "AutoMall{" +
                "idMall=" + idMall +
                ", denMall='" + denMall + '\'' +
                ", adress='" + adress + '\'' +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
