package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
	@Autowired
	IDoctorRepository doctorRepository;
	@Override
	public void addDoctor(Doctor doctor) {
		
		doctorRepository.addDoctor(doctor);
	}

	public void updateDoctor(int doctorId, double consulationFee) {
		
		doctorRepository.updateDoctor(doctorId, consulationFee);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public List<Doctor> getAll() throws IdNotFoundException{
		List<Doctor> doctor=doctorRepository.findAll();
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}
	

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		List<Doctor> doctor=doctorRepository.findBySpeciality(speciality);
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}
	
	

	@Override
	public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctor=doctorRepository.findBySpecialityAndExperience(speciality, experience);
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}
	

	@Override
	public List<Doctor> getBySpecialityAndFeesLessThan(String speciality, int consultationFees)
			throws DoctorNotFoundException {
		List<Doctor> doctor=doctorRepository.findBySpecialityAndFeesLessThan(speciality,consultationFees );
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}
	
	

	@Override
	public List<Doctor> getBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException {
		List<Doctor> doctor=doctorRepository.findBySpecialityAndRating(speciality, ratings);
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}
	

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		List<Doctor> doctor=doctorRepository.findBySpecialityAndNameContains(speciality, doctorName);
		if(doctor.isEmpty()) 
			throw new DoctorNotFoundException("doctor not found");
		return doctor;
		}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		Doctor doctor=doctorRepository.findById(doctorId);
		if(doctor==null)
			throw new IdNotFoundException("id not found");
		else
		
		return doctor;
	}
	

}
