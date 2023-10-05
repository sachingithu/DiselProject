package com.svj.masterservice;

import java.util.List;

import com.svj.mastermodel.VehicleMasterModel;

public interface IVehicleMasterService {
	public String saveVehicleMaster(VehicleMasterModel vehicleMaster);
	List<VehicleMasterModel> getallDetails();
}
