package com.example.role_aleatorio.entities;

import com.example.role_aleatorio.dto.PlaceDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tb_place")
public class Place implements Serializable {
    public static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(columnDefinition ="TEXT")
    private String imagem;
    private String local;
    private double cost;

    @Column(columnDefinition ="TEXT")
    private String description;
    private long like;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category category;

    public  Place(){}

    public Place(long id, String name, String imagem, String local,
                 double cost, String description, long like, Category category ) {
        this.id = id;
        this.name = name;
        this.imagem = imagem;
        this.local = local;
        this.cost = cost;
        this.description = description;
        this.like = like;
        this.category = category;
    }

    public Place(PlaceDTO entity) {
        this.setId(entity.getId());
        this.setName(entity.getName());
        this.setImagem(entity.getImagem());
        this.setLocal(entity.getLocal());
        this.setCost(entity.getCost());
        this.setDescription(entity.getDescription());
        this.setLike(entity.getLike());
        this.setCategory(entity.getCategory());
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

    public void setDescription(String description) {
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
        Place place = (Place) o;
        return id == place.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
