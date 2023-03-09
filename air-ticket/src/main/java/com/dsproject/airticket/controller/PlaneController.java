package com.dsproject.airticket.controller;

import com.dsproject.airticket.dto.PlaneRequest;
import com.dsproject.airticket.dto.PlaneResponse;
import com.dsproject.airticket.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plane")
@RequiredArgsConstructor

public class PlaneController {
    private final PlaneService planeService;
    //create Planes
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPlane(@RequestBody PlaneRequest planeRequest){
        planeService.createPlane(planeRequest); //call the createPlane method
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PlaneResponse> getAllPlanes(){
        return planeService.getAllPlanes();
    }


}
