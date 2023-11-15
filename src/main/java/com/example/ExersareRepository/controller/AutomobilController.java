package com.example.ExersareRepository.controller;

import com.example.ExersareRepository.autoRepository.AutomobilRepository;
import com.example.ExersareRepository.entity.Automobil;
import com.example.ExersareRepository.entity.ColorAuto;
import com.example.ExersareRepository.service.AutomobilService;
import com.example.ExersareRepository.service.AutomobilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/api/auto")
public class AutomobilController {

    @Autowired
    AutomobilService automobilService;


//    public void saveAuto(@RequestBody Automobil automobil) {
//        automobilService.saveAuto(automobil);
//
//    }
    @PostMapping("/save")
    public void saveAuto() {
        Automobil automobil = new Automobil("BMW", "M4",200,2010, ColorAuto.BLACK, 20000);
        automobilService.saveAuto(automobil);

    }

    @PostMapping("/save/all")
    public void saveAllAuto(@RequestBody List<Automobil> automobilList) {
        automobilService.saveAllAuto(automobilList);
    }

    @GetMapping("/get/all")
    public List<Automobil> getAllAuto() {
        return automobilService.getAllAuto();
    }


    @GetMapping("/get/auto/{id}")
    public Automobil findAutoById(@PathVariable int id) {
        return automobilService.findAutoById(id);
    }


    @GetMapping("/get/autoByDenAuto/{denAuto}")
    public Automobil findAutoByDenAuto(@PathVariable String denAuto) {
        return automobilService.findAutoByDenAuto(denAuto);
    }

    @GetMapping("/get/all/autoByMarca/{marca}")
    public List<Automobil> getAllAutoByMarca(@PathVariable String marca){
        return automobilService.findAllAutoByMarca(marca);
    }
    @GetMapping("/get/all/orderByKmDesc")
    public List<Automobil> getAllAutoOrderByKmDesc(){
        return automobilService.findAllByOrderByKmDesc();
    }
    @GetMapping("/get/all/byMarcaAndAge/{marca}/{age}")
    public List<Automobil> getAllAutoByMarcaAndAge(@PathVariable String marca, @PathVariable int age){
        return automobilService.findByMarcaAndAge(marca, age);
    }
    @DeleteMapping("/delete/byId/{id}")
    public void deleteAutoById(@PathVariable int id){
        automobilService.deleteAutoById(id);
    }
    @PutMapping("/update/byId")
    public void updateAutoById(@RequestBody Map<String, Object> requestBody) {
        int km = (int) requestBody.get("km");
        int age = (int) requestBody.get("age");
        int id = (int) requestBody.get("id");

        automobilService.updateKmAutoAndAgeById(km, age, id);
    }

    @PutMapping("/update/myVersion/byId")
    public void updateAutoByIdSecondVerison(@RequestBody Map<String, Object> requestBody) {
        int km = (int) requestBody.get("km");
        int age = (int) requestBody.get("age");
        int id = (int) requestBody.get("id");

        automobilService.updateKmAutoAndAgeByIdSecondMode(km, age, id);
    }



}
