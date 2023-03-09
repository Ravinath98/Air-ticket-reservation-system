package com.dsproject.airticket.repository;
import com.dsproject.airticket.model.Plane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaneRepository extends MongoRepository<Plane,String> {

}
