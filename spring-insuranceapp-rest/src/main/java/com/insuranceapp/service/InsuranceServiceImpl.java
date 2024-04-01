package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Override
	public List<Insurance> getAll() {
		
		return getAllInsurances(); 
	}

	@Override
	public Insurance getById(int insuranceId) {
		for(Insurance insurance :getAllInsurances()){
			if(insurance.getInsuranceId()==insuranceId)
				return insurance;
		}
		return null;
	}
	private List<Insurance> getAllInsurances(){
		return Arrays.asList(new Insurance(101, "v0-101n","voyaindia" ,"health", 22, 10000));
	}

}
