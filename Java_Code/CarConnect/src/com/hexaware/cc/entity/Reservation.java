/*
 * Author: Venkatesh Pai & Amir Manzoor
 * Desc: Carconnect (Reservation Entity)
 * Date: 21/10/2024
 */

package com.hexaware.cc.entity;

import java.sql.Date;

public class Reservation {
    private int reservationID;
    private int customerID;
    private int vehicleID;
    private Date startDate;
    private Date endDate;
    private double totalCost;
    private String status;


    public Reservation() {
    	super();
    }

    public Reservation(int reservationID, int customerID, int vehicleID, Date startDate,
                       Date endDate, double totalCost, String status) {
    	super();
        this.reservationID = reservationID;
        this.customerID = customerID;
        this.vehicleID = vehicleID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
        this.status = status;
    }

  
    public int getReservationID() { return reservationID; }
    public void setReservationID(int reservationID) { this.reservationID = reservationID; }

    public int getCustomerID() { return customerID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public int getVehicleID() { return vehicleID; }
    public void setVehicleID(int vehicleID) { this.vehicleID = vehicleID; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public double getTotalCost() { return totalCost; }
    public void setTotalCost(double totalCost) { this.totalCost = totalCost; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

	@Override
	public String toString() {
		return "Reservation [reservationID=" + reservationID + ", customerID=" + customerID + ", vehicleID=" + vehicleID
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", totalCost=" + totalCost + ", status="
				+ status + "]";
	}


//    public void calculateTotalCost(double dailyRate) {
//        long days = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
//        this.totalCost = days * dailyRate;
//    }
}
