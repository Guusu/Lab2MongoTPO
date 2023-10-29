package com.up.lab.tpo.mapper;

import com.up.lab.tpo.dto.DireccionDTO;
import com.up.lab.tpo.dto.RestaurantDTO;
import com.up.lab.tpo.model.Direccion;
import com.up.lab.tpo.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestoMapper {

    @Mapping(target = "nombreRestaurante", source = "nombre")
    @Mapping(target = "numeroTelefono", source = "telefono")
    RestaurantDTO restoModelToDTO(Restaurant restaurant);
    @Mapping(source = "nombreRestaurante", target = "nombre")
    @Mapping(source = "numeroTelefono", target = "telefono")
    Restaurant restoDTOToModel(RestaurantDTO restaurant);

    @Mapping(target = "nombreCalle", source = "calle")
    @Mapping(target = "nombreCiudad", source = "ciudad")
    @Mapping(target = "nombreEstado", source = "estado")
    DireccionDTO direccionModelToDTO (Direccion direccion);

    @Mapping(source = "nombreCalle", target = "calle")
    @Mapping(source = "nombreCiudad", target = "ciudad")
    @Mapping(source = "nombreEstado", target = "estado")
    Direccion direccionDTOToModel (DireccionDTO direccion);
    List<RestaurantDTO> restoModelListToDTO (List<Restaurant> restaurants);
    List<Restaurant> restoDTOToModel (List<RestaurantDTO> restaurants);


}
