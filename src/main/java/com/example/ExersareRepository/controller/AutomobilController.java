package com.example.ExersareRepository.controller;

import com.example.ExersareRepository.autoRepository.AutomobilRepository;
import com.example.ExersareRepository.entity.AutoMall;
import com.example.ExersareRepository.entity.Automobil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/auto")
public class AutomobilController {
    @Autowired
    AutomobilRepository automobilRepository;

    @PostMapping("/save/auto")
    public void saveAuto(@RequestBody Automobil automobil) {
        automobilRepository.save(automobil);

    }

    @PostMapping("/save/all")
    public void saveAllAuto(@RequestBody List<Automobil> automobilList) {
        automobilRepository.saveAll(automobilList);
    }

    @GetMapping("/get/all")
    public List<Automobil> getAllAuto() {
        return automobilRepository.findAll();
    }


    @GetMapping("/get/auto/{id}")
    public Automobil findAutoById(@PathVariable int id) {
        return automobilRepository.findAutoById(id);
    }


    @GetMapping("/get/autoByDenAuto/{denAuto}")
    public Automobil findAutoByDenAuto(@PathVariable String denAuto) {
        return automobilRepository.findAutoByDenAuto(denAuto);
    }

    @GetMapping("/get/all/autoByMarca/{marca}")
    public List<Automobil> getAllAutoByMarca(@PathVariable String marca){
        return automobilRepository.findAllAutoByMarca(marca);
    }
    @GetMapping("/get/all/orderByKmDesc")
    public List<Automobil> getAllAutoOrderByKmDesc(){
        return automobilRepository.findAllByOrderByKmDesc();
    }
    @GetMapping("/get/all/byMarcaAndAge/{marca}/{age}")
    public List<Automobil> getAllAutoByMarcaAndAge(@PathVariable String marca, @PathVariable int age){
        return automobilRepository.findByMarcaAndAge(marca, age);
    }
    @DeleteMapping("/delete/byId/{id}")
    public void deleteAutoById(@PathVariable int id){
        automobilRepository.deleteById(id);
    }
    @PutMapping("/update/byId")
    public  void updatrAutoById(@RequestParam int km, @RequestParam int age, @RequestParam int id){
        automobilRepository.updateKmAutoAndAgeById(km, age, id);
    }



}
