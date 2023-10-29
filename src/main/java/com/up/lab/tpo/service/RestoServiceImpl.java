package com.up.lab.tpo.service;

import com.up.lab.tpo.dto.RestaurantDTO;
import com.up.lab.tpo.dto.RestaurantsListResponse;
import com.up.lab.tpo.mapper.RestoMapper;
import com.up.lab.tpo.model.Restaurant;
import com.up.lab.tpo.repository.RestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestoServiceImpl implements RestoService {
    @Autowired
    RestoRepository repository;
    @Autowired
    RestoMapper restoMapper;

    public RestaurantsListResponse getAllRestos() {
        RestaurantsListResponse response = new RestaurantsListResponse();

        List<RestaurantDTO> restaurants = restoMapper.restoModelListToDTO(repository.findAll());

        response.setRestaurants(restaurants);

        return response;
    }

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO request) {
        Restaurant restoToCreate = restoMapper.restoDTOToModel(request);

        restoToCreate.setId(null);

        repository.save(restoToCreate);

        return restoMapper.restoModelToDTO(restoToCreate);
    }

    @Override
    public RestaurantDTO updateRestaurant(RestaurantDTO request) {
        Restaurant restoToUpdate = restoMapper.restoDTOToModel(request);

        repository.save(restoToUpdate);

        return request;
    }
}
