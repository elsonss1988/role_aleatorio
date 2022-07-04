package com.example.role_aleatorio.dto;

import com.example.role_aleatorio.entities.Category;
import com.example.role_aleatorio.entities.Place;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class CategoryDTO implements Serializable {
    public static final long serialVersionUID=1l;

    private long id;
    private String name;
    private List<PlaceDTO> places = new ArrayList<>();

    public CategoryDTO(){}

    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entities){
        this.setId(entities.getId());
        this.setName(entities.getName());
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlaceDTO> getPlaces() {
        return places;
    }

    public void addPlaces(PlaceDTO place) {
        places.add(place);
    }
}
