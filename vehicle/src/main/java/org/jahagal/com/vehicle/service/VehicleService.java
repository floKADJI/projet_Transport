package org.jahagal.com.vehicle.service;

import com.sun.xml.bind.v2.TODO;
import lombok.Data;
import org.jahagal.com.vehicle.entities.Vehicle;
import org.jahagal.com.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * Method de recherche d'un vehicule par son id dans la BD
     * @param id - Id du vehicle
     * @return renvoie un object vehicle si disponible en BD, sinon pas de retour
     */
    public Optional<Vehicle> getVehicle(final Long id){
        return  vehicleRepository.findById(id);
    }

    /**
     * Method de recherche de tous les vehicles dans la BD
     * @return Iterable sur tous le vehicle
     */
    public Iterable<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    /**
     * Method de suppression d'un vehicule par son id dans la BD
     * @param id - Id du vehicle
     */
    public void deleteVehicle(final Long id){
        vehicleRepository.deleteById(id);
    }

    /**
     * Method d'enregistrement d'un vehicule dans la BD
     * @param vehicle - l'object du vehicle
     * @return savedVehicle qui correspond à l'object vehicle enregistré
     */
    public Vehicle saveVehicle(Vehicle vehicle){
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return savedVehicle;
    }

    //TODO: Method de modification d'un vehicle existant déjà dans la BD
}
