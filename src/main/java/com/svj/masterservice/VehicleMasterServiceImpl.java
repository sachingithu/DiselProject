package com.svj.masterservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svj.mastermodel.VehicleMasterModel;
import com.svj.masterrepo.IVehicleMasterRepo;
@Service
public class VehicleMasterServiceImpl implements IVehicleMasterService {
	@Autowired
	private IVehicleMasterRepo repo;
	@Override
	public String saveVehicleMaster(VehicleMasterModel vehicleMaster) {
		VehicleMasterModel model=repo.save(vehicleMaster);
		return "Vehicle infor saved with id "+model.getVehicleId();
	}
	@Override
	public List<VehicleMasterModel> getallDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
