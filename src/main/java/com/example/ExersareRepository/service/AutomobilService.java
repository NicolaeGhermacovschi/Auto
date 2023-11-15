package com.example.ExersareRepository.service;

import com.example.ExersareRepository.entity.Automobil;

import java.util.List;

public interface AutomobilService {

    void saveAuto(Automobil automobil);
    void saveAllAuto(List<Automobil> automobilList);
    List<Automobil> getAllAuto();
    Automobil findAutoById(int id);
    Automobil findAutoByDenAuto(String denAuto);

    List<Automobil> findAllAutoByMarca(String marca);

    List<Automobil> findAllByOrderByKmDesc();
    List<Automobil> findByMarcaAndAge(String marca, int age);
    void deleteAutoById(int id);
    void updateKmAutoAndAgeById(int km, int age,  int id);
    void updateKmAutoAndAgeByIdSecondMode(int km, int age,  int id);

}
