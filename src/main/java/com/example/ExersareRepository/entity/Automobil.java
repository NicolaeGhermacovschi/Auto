package com.example.ExersareRepository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "automobil")
public class Automobil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String denAuto;
    private String marca;
    private Integer km;
    private Integer age;
    private ColorAuto colorAuto;

    private Integer idMall;

    public Automobil() {
    }

    public Automobil(long id, String denAuto, String marca,
                     Integer km, Integer age, ColorAuto colorAuto, Integer idMall) {
        this.id = id;
        this.denAuto = denAuto;
        this.marca = marca;
        this.km = km;
        this.age = age;
        this.colorAuto = colorAuto;
        this.idMall = idMall;
    }

    public Automobil(String denAuto, String marca,
                     Integer km, Integer age, ColorAuto colorAuto, Integer idMall) {
        this.denAuto = denAuto;
        this.marca = marca;
        this.km = km;
        this.age = age;
        this.colorAuto = colorAuto;
        this.idMall = idMall;
    }

    public Integer getIdMall() {
        return idMall;
    }

    public void setIdMall(Integer idMall) {
        this.idMall = idMall;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setId(long id) {
        this.id = id;
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
