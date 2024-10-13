package com.hexaware.cc.dao;

import java.sql.Connection;
import java.util.List;

import com.hexaware.cc.entity.Vehicle;

public class VehicleDaoImp implements IVehicleDao {
	private Connection conn;
	
	public VehicleDaoImp () {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public Vehicle getVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> getAvailableVehicles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addVehicle(Vehicle vehicleData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVehicle(Vehicle vehicleData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeVehicle(int vehicleId) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}