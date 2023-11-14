package com.example.ExersareRepository.controller;

import com.example.ExersareRepository.autoMallRepository.AutoMallRepository;
import com.example.ExersareRepository.entity.AutoMall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/autoMall")
public class AutoMallController {

    @Autowired
    AutoMallRepository autoMallRepository;

    @PostMapping("/save")
    public void saveAutoMall(@RequestBody AutoMall autoMall) {
        autoMallRepository.save(autoMall);
    }

    @PostMapping("/save/all")
    public void saveAllAutoMall(@RequestBody List<AutoMall> autoMallList) {
        autoMallRepository.saveAll(autoMallList);
    }
    @GetMapping("/get/all")
    public List<AutoMall> getAllAutoMall(){
        return autoMallRepository.findAll();
    }

    @GetMapping("/get/autoMallById/{idMall}")
    public AutoMall getAutoMallById(@PathVariable int idMall) {
        return autoMallRepository.findAutoMallByIdMall(idMall);
    }
    @GetMapping("/get/autoByDen/{denMall}")
    public AutoMall getAutoMallByDen(@PathVariable String denMall){
        return autoMallRepository.findAutoMallByDenMall(denMall);
    }
    @DeleteMapping("/delete/autoMallById/{idMall}")
    public void deleteAutoMallById(@PathVariable int idMall){
        autoMallRepository.deleteById(idMall);
    }

}
