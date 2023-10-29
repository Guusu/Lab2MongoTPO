package com.up.lab.tpo.repository;

import com.up.lab.tpo.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestoRepository extends MongoRepository<Restaurant,String> {
}
