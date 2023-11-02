package com.up.lab.tpo.service;

import com.up.lab.tpo.dto.RestaurantDTO;
import com.up.lab.tpo.dto.RestaurantsListResponse;

public interface RestoService {
     RestaurantsListResponse getAllRestos ();
     RestaurantDTO createRestaurant (RestaurantDTO request);
     RestaurantDTO updateRestaurant (RestaurantDTO request);

     RestaurantsListResponse getOneResto(String id);
}
