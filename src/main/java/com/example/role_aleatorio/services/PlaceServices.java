package com.example.role_aleatorio.services;


import com.example.role_aleatorio.dto.PlaceDTO;
import com.example.role_aleatorio.entities.Place;
import com.example.role_aleatorio.repository.PlaceRepository;
import com.example.role_aleatorio.services.exceptions.ResourceNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlaceServices {

    @Autowired
    private PlaceRepository placeRepository;

    @Transactional(readOnly = true)
    public List<PlaceDTO> findAll(){
        List<Place> list = placeRepository.findAll();
        List<PlaceDTO> listDTO = list.stream().map(x->new PlaceDTO(x)).collect(Collectors.toList());
        return listDTO;
    }

    @Transactional(readOnly = true)
    public PlaceDTO findById(long id){
      Optional<Place> place = placeRepository.findById(id);
      Place entity = place.orElseThrow(() -> new ResourceNotFoundExceptions("Desculpe Local Não encontrado"));
      PlaceDTO dto=  new PlaceDTO(entity);
      return dto;
    }
}
