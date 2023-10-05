package com.svj.mastermodel;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class VehicleMasterModel implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vehicleId;
	private String vehicleType;
	private String vehicleNumber;
	private String ownerName;
	private String driverName;
	private String ownerNo;
	private String clientNo;
	private String average;
	private String selectRate;
	
	private String ratePerHours;

	public VehicleMasterModel(Integer vehicleId, String vehicleType, String vehicleNumber, String ownerName,
			String driverName, String ownerNo, String clientNo, String average, String selectRate,
			String ratePerHours) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.driverName = driverName;
		this.ownerNo = ownerNo;
		this.clientNo = clientNo;
		this.average = average;
		this.selectRate = selectRate;
		this.ratePerHours = ratePerHours;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getOwnerNo() {
		return ownerNo;
	}

	public void setOwnerNo(String ownerNo) {
		this.ownerNo = ownerNo;
	}

	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getSelectRate() {
		return selectRate;
	}

	public void setSelectRate(String selectRate) {
		this.selectRate = selectRate;
	}

	public String getRatePerHours() {
		return ratePerHours;
	}

	public void setRatePerHours(String ratePerHours) {
		this.ratePerHours = ratePerHours;
	}

	@Override
	public String toString() {
		return "VehicleMasterModel [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleNumber="
				+ vehicleNumber + ", ownerName=" + ownerName + ", driverName=" + driverName + ", ownerNo=" + ownerNo
				+ ", clientNo=" + clientNo + ", average=" + average + ", selectRate=" + selectRate + ", ratePerHours="
				+ ratePerHours + "]";
	}
	
	
}
