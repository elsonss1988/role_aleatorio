package com.example.role_aleatorio.dto;

import com.example.role_aleatorio.entities.Category;
import com.example.role_aleatorio.entities.Place;

import java.io.Serializable;
import java.util.Objects;

public class PlaceDTO implements Serializable {
    public static final long serialVersionUID=1l;

    private long id;
    private String name;
    private String imagem;
    private String local;
    private double cost;
    private String description;
    private long like;
    private Category category;

    public PlaceDTO(){}

    public PlaceDTO(long id, String name, String imagem, String local, double cost, String description, long like, Category category) {
        this.id = id;
        this.name = name;
        this.imagem = imagem;
        this.local = local;
        this.cost = cost;
        this.description = description;
        this.like = like;
        this.category=category;
    }

    public PlaceDTO(Place entities){
        this.setId(entities.getId());
        this.setName(entities.getName());
        this.setImagem(entities.getImagem());
        this.setLocal(entities.getLocal());
        this.setCost(entities.getCost());
        this.setDescription(entities.getDescription());
        this.setLike(entities.getLike());
        this.setCategory(entities.getCategory());
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String describe) {
        this.description = description;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceDTO placeDTO = (PlaceDTO) o;
        return id == placeDTO.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
