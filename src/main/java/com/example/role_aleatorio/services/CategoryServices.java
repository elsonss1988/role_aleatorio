package com.example.role_aleatorio.services;

import com.example.role_aleatorio.dto.CategoryDTO;
import com.example.role_aleatorio.entities.Category;
import com.example.role_aleatorio.repository.CategoryRepository;
import com.example.role_aleatorio.services.exceptions.ResourceNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> list = categoryRepository.findAll();
        List<CategoryDTO> listDTO = list.stream().map(x-> new CategoryDTO(x)).collect(Collectors.toList());
        return listDTO;
    }

    public CategoryDTO findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        Category entity=category.orElseThrow(()-> new ResourceNotFoundExceptions("Sorry, Não encontramos nada"));
        CategoryDTO dto = new CategoryDTO(entity);
        return dto;
    }
}
