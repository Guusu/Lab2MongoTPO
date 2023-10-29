package com.up.lab.tpo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RestaurantsListResponse {

    @JsonProperty(value = "restaurants")
    List<RestaurantDTO> restaurants;

    public List<RestaurantDTO> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantDTO> restaurants) {
        this.restaurants = restaurants;
    }
}
