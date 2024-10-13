package com.hexaware.cc.service;

import java.util.List;
import com.hexaware.cc.entity.Vehicle;

public interface IVehicle {
    
    Vehicle getVehicleById(int vehicleId);
    
    List<Vehicle> getAvailableVehicles();
    
    int addVehicle(Vehicle vehicleData);
    
    int updateVehicle(Vehicle vehicleData);
    
    int removeVehicle(int vehicleId);
}