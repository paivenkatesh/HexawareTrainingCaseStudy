package com.hexaware.cc.service;

import java.util.List;

import com.hexaware.cc.dao.IReservationDao;
import com.hexaware.cc.dao.ReservationDaoImp;
import com.hexaware.cc.entity.Reservation;

public class ReservationServiceImp implements IReservation {
	
	private IReservationDao reservationDao;
	
	public ReservationServiceImp()
	{
		this.reservationDao = new ReservationDaoImp();
	
	}
	@Override
	public Reservation getReservationById(int reservationId) {
		return reservationDao.getReservationById(reservationId);
	}

	@Override
	public List<Reservation> getReservationsByCustomerId(int customerId) {
		return reservationDao.getReservationsByCustomerId(customerId);
	}

	@Override
	public int createReservation(Reservation reservationData) {
		return reservationDao.createReservation(reservationData);
	}

	@Override
	public int updateReservation(Reservation reservationData) {
		return reservationDao.updateReservation(reservationData);
	}

	@Override
	public int cancelReservation(int reservationId) {
		 return reservationDao.cancelReservation(reservationId);
	}

}
