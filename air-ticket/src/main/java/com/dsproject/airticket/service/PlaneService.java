package com.dsproject.airticket.service;
import java.util.List;

import com.dsproject.airticket.dto.PlaneRequest;
import com.dsproject.airticket.dto.PlaneResponse;
import com.dsproject.airticket.model.Plane;
import com.dsproject.airticket.repository.PlaneRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //this will create the constructor at the compile time
@Slf4j
public class PlaneService {
    private final PlaneRepository planeRepository;



    public void createPlane(PlaneRequest planeRequest){

        //build the plane object
        Plane plane=Plane.builder()
                .departure(planeRequest.getDeparture())
                .destination(planeRequest.getDestination())
                .arrival_time(planeRequest.getArrival_time())
                .duration(planeRequest.getDuration())
                .seats(planeRequest.getSeats())
                .build();
        //save the instance to the database(by accessing plane repository)
        planeRepository.save(plane);
        log.info("Plane {} is saved",plane.getId());

    }

    public List<PlaneResponse> getAllPlanes() {
        List<Plane> planes= planeRepository.findAll(); //read all the planes inside the database
        //map Planes into planeresponse class
        return planes.stream().map(this::mapToPlaneResponse).toList();
    }

    private PlaneResponse mapToPlaneResponse(Plane plane) {
        return PlaneResponse.builder()
                .id(plane.getId())
                .departure(plane.getDeparture())
                .destination(plane.getDestination())
                .arrival_time(plane.getArrival_time())
                .duration(plane.getDuration())
                .seats(plane.getSeats())
                .build();
    }
}
