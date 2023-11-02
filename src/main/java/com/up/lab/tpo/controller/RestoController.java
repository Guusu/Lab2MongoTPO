package com.up.lab.tpo.controller;

import com.up.lab.tpo.dto.RestaurantDTO;
import com.up.lab.tpo.dto.RestaurantsListResponse;
import com.up.lab.tpo.service.RestoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class RestoController {

    private final RestoServiceImpl restoService;

    public RestoController(RestoServiceImpl restoService) {
        this.restoService = restoService;
    }

    @GetMapping()
    public ResponseEntity<RestaurantsListResponse> getAllRestaurants(){

        RestaurantsListResponse response = restoService.getAllRestos();

        return ResponseEntity.ok(response);

    }
    @GetMapping("/{id}")
    public ResponseEntity<RestaurantsListResponse> getAllRestaurants(@PathVariable(name = "id") String id){

        RestaurantsListResponse response = restoService.getOneResto(id);

        return ResponseEntity.ok(response);

    }
    @PostMapping()
    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO request){

        RestaurantDTO response = restoService.createRestaurant(request);

        return ResponseEntity.ok(response);

    }
    @PutMapping()
    public ResponseEntity<RestaurantDTO> updateRestaurant(@RequestBody RestaurantDTO request){

        RestaurantDTO response = restoService.updateRestaurant(request);

        return ResponseEntity.ok(response);

    }
}
