package com.hexaware.cc.service;

import java.util.List;
import com.hexaware.cc.entity.Reservation;

public interface IReservation {
    
    Reservation getReservationById(int reservationId);
    
    List<Reservation> getReservationsByCustomerId(int customerId);
    
    int createReservation(Reservation reservationData);
    
    int updateReservation(Reservation reservationData);
    
    int cancelReservation(int reservationId);
}