package com.example.role_aleatorio.dto;

import com.example.role_aleatorio.entities.Category;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_category")
public class CategoryDTO implements Serializable {
    public static final long serialVersionUID=1l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

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


}
