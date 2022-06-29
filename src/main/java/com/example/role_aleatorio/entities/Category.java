package com.example.role_aleatorio.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_category")
public class Category implements Serializable {
    public static final long serialVersionUID=1l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Category(){}

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
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