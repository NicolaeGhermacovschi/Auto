package com.example.ExersareRepository.autoRepository;

import com.example.ExersareRepository.entity.Automobil;
import com.example.ExersareRepository.entity.AutoMall;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutomobilRepository extends JpaRepository<Automobil, Integer> {

    Automobil findAutoById(int id);
    Automobil findAutoByDenAuto(String denAuto);

    List<Automobil> findAllAutoByMarca(String marca);

    List<Automobil> findAllByOrderByKmDesc();
    List<Automobil> findByMarcaAndAge(String marca, int age);
    @Modifying
    @Query("UPDATE Automobil a SET a.km = :km, a.age = :age WHERE a.id = :id")
    void updateKmAutoAndAgeById(@Param("km") int km, @Param("age") int age, @Param("id") int id);

    // void updateAutomobilColorById(int id, ColorAuto colorAuto);

}
