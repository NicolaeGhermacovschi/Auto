package com.example.ExersareRepository.autoMallRepository;

import com.example.ExersareRepository.entity.Automobil;
import com.example.ExersareRepository.entity.AutoMall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoMallRepository extends JpaRepository<AutoMall, Integer> {

    AutoMall findAutoMallByIdMall(int idMall);
    //  void updateAutoMallByIdMall(int idMall);
    AutoMall findAutoMallByDenMall(String denMall);
}
