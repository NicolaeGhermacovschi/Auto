package com.example.ExersareRepository.service;

import com.example.ExersareRepository.autoRepository.AutomobilRepository;
import com.example.ExersareRepository.entity.Automobil;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AutomobilServiceImpl  implements AutomobilService{
    @Autowired
    AutomobilRepository automobilRepository;

    @Override
    public void saveAuto(Automobil automobil) {
        automobilRepository.save(automobil);
    }

    @Override
    public void saveAllAuto(List<Automobil> automobilList) {
automobilRepository.saveAll(automobilList);
    }

    @Override
    public List<Automobil> getAllAuto() {
        return automobilRepository.findAll();
    }

    @Override
    public Automobil findAutoById(int id) {
        return automobilRepository.findAutoById(id);
    }

    @Override
    public Automobil findAutoByDenAuto(String denAuto) {
        return automobilRepository.findAutoByDenAuto(denAuto);
    }

    @Override
    public List<Automobil> findAllAutoByMarca(String marca) {
        return automobilRepository.findAllAutoByMarca(marca);
    }

    @Override
    public List<Automobil> findAllByOrderByKmDesc() {
        return automobilRepository.findAllByOrderByKmDesc();
    }

    @Override
    public List<Automobil> findByMarcaAndAge(String marca, int age) {
        return automobilRepository.findByMarcaAndAge(marca, age);
    }

    @Override
    public void deleteAutoById(int id) {
        automobilRepository.deleteById(id);
    }

    @Override
    public void updateKmAutoAndAgeById(int km, int age, int id){

        automobilRepository.updateKmAutoAndAgeById(km,age, id);
    }

    @Override
    public void updateKmAutoAndAgeByIdSecondMode(int km, int age, int id) {
        Automobil automobil = automobilRepository.findAutoById(id);
        System.out.println("Automobil pana la modificare" + automobil.toString());
        automobil.setKm(km);
        automobil.setAge(age);
        System.out.println("Automobil dupa  modificare" + automobil.toString());

        automobilRepository.save(automobil);
    }

}
