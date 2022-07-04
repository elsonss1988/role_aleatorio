package com.example.role_aleatorio.repository;

import com.example.role_aleatorio.entities.Category;
import com.example.role_aleatorio.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM TB_PLACE WHERE CATEGORY_ID = :id ")
    List <Place> findByCategory(Long id);

}
