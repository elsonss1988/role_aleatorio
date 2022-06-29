package com.example.role_aleatorio.controller;

import com.example.role_aleatorio.dto.PlaceDTO;
import com.example.role_aleatorio.entities.Place;
import com.example.role_aleatorio.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private PlaceServices placeServices;

    @GetMapping
    public ResponseEntity<List<PlaceDTO>> findAll(){
       List<PlaceDTO> place = placeServices.findAll();
       return ResponseEntity.ok().body(place);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlaceDTO> findById(@PathVariable Long id){
        PlaceDTO place= placeServices.findById(id);
        return ResponseEntity.ok().body(place);
    }
}
