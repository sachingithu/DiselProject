package com.svj.masterrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svj.mastermodel.VehicleMasterModel;

public interface IVehicleMasterRepo extends JpaRepository<VehicleMasterModel, Integer> {

}
