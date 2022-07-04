package com.example.role_aleatorio.controller;

import com.example.role_aleatorio.dto.PlaceDTO;
import com.example.role_aleatorio.entities.Place;
import com.example.role_aleatorio.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value="/{id}")
    public ResponseEntity<PlaceDTO> findById(@PathVariable Long id){
        PlaceDTO place= placeServices.findById(id);
        return ResponseEntity.ok().body(place);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<PlaceDTO> update(@PathVariable Long id){
        PlaceDTO dto = placeServices.updateRating(id);
        return ResponseEntity.ok().body(dto);
    }
}
