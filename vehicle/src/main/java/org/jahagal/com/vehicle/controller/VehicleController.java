package org.jahagal.com.vehicle.controller;

import org.jahagal.com.vehicle.entities.Vehicle;
import org.jahagal.com.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    /**
     * Read - Get all vehicles
     * @return - An Iterable object of Vehicle full filled
     */
    @GetMapping("/vehicles")
    public Iterable<Vehicle> getVehicles(){
        return vehicleService.getVehicles();
    }
}
