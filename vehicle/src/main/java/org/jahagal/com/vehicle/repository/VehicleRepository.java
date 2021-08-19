package org.jahagal.com.vehicle.repository;

import org.jahagal.com.vehicle.entities.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository <Vehicle, Long>{
}
