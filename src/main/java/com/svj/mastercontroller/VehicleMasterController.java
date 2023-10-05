package com.svj.mastercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svj.mastermodel.VehicleMasterModel;
import com.svj.masterservice.IVehicleMasterService;

@RestController
@RequestMapping("/Disel/api")
public class VehicleMasterController {

	@Autowired
	private IVehicleMasterService service;
	@PostMapping("/saveInfo")
	public ResponseEntity<String> saveVehicleData(@RequestBody VehicleMasterModel model){
		String msg=service.saveVehicleMaster(model);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
