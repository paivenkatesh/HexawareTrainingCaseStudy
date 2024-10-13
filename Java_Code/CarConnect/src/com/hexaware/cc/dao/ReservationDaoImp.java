package com.hexaware.cc.dao;

import java.sql.Connection;
import java.util.List;

import com.hexaware.cc.entity.Reservation;

public class ReservationDaoImp implements IReservationDao {
	private Connection conn;
	
	public ReservationDaoImp () {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public Reservation getReservationById(int reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getReservationsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createReservation(Reservation reservationData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReservation(Reservation reservationData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cancelReservation(int reservationId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}