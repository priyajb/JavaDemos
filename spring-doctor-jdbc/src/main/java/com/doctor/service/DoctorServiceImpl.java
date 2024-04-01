package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.exception.IdNotFoundException;
import com.doctor.model.Doctor;
import com.doctor.repository.DoctorRepositoryImpl;
import com.doctor.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository doctorRepository;

	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.addDoctor(doctor);

	}

	@Override
	public void updateDoctor(int doctorId, double consulationFee) {
		doctorRepository.updateDoctor(doctorId, consulationFee);

	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorRepository.deleteDoctor(doctorId);

	}

	@Override
	public List<Doctor> getAll() {
		List<Doctor> doctors = doctorRepository.findAll();
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("DOCTOR NOT FOUND");
		return doctors;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {

		List<Doctor> doctors = doctorRepository.findBySpeciality(speciality);
		if (doctors.isEmpty())
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctors = doctorRepository.findBySpecialityAndExperience(speciality, experience);
		if (doctors.isEmpty())
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndFeesLessThan(String speciality, int consultationFees)
			throws DoctorNotFoundException {
		List<Doctor> doctors = doctorRepository.findBySpecialityAndFeesLessThan(speciality, consultationFees);
		if (doctors.isEmpty())
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException {
		List<Doctor> doctors = doctorRepository.findBySpecialityAndRating(speciality, ratings);
		if (doctors.isEmpty())
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		List<Doctor> doctors = doctorRepository.findBySpecialityAndNameContains(speciality, doctorName);
		if (doctors.isEmpty())
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		Doctor doctors = doctorRepository.findById(doctorId);
		if (doctors.equals(doctors))
			throw new DoctorNotFoundException("doctor not available");
		else
			return doctors;
	}
}
