package com.hexaware.cc.service;

import java.util.List;
import com.hexaware.cc.dao.IVehicleDao;
import com.hexaware.cc.dao.VehicleDaoImp;
import com.hexaware.cc.entity.Vehicle;

public class VehicleServiceImp implements IVehicle {
	
	private IVehicleDao dao;

	public VehicleServiceImp() {
		dao = new VehicleDaoImp();
	}
	
	
	@Override
	public Vehicle getVehicleById(int vehicleId) {
		return dao.getVehicleById(vehicleId);
	}

	@Override
	public List<Vehicle> getAvailableVehicles() {
		return dao.getAvailableVehicles();
	}

	@Override
	public int addVehicle(Vehicle vehicleData) {
		return dao.addVehicle(vehicleData);
	}

	@Override
	public int updateVehicle(Vehicle vehicleData) {
		return dao.updateVehicle(vehicleData);
	}

	@Override
	public int removeVehicle(int vehicleId) {
		return dao.removeVehicle(vehicleId);
	}

	
	
	
}