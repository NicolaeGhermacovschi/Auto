package com.example.ExersareRepository.entity;

import jakarta.persistence.*;

@Entity
public class Automobil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String denAuto;
    private String marca;
    private Integer km;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private ColorAuto colorAuto;

    private Integer idMall;

    public Integer getIdMall() {
        return idMall;
    }

    public void setIdMall(Integer idMall) {
        this.idMall = idMall;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenAuto() {
        return denAuto;
    }

    public void setDenAuto(String denAuto) {
        this.denAuto = denAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ColorAuto getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(ColorAuto colorAuto) {
        this.colorAuto = colorAuto;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", denAuto='" + denAuto + '\'' +
                ", marca='" + marca + '\'' +
                ", km=" + km +
                ", age=" + age +
                ", colorAuto=" + colorAuto +
                ", idMall=" + idMall +
                '}';
    }
}
