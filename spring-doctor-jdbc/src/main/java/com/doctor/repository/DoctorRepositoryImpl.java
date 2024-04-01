package com.doctor.repository;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.exception.IdNotFoundException;
import com.doctor.model.Doctor;

import com.doctor.util.Queries;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void addDoctor(Doctor doctor) {
		Object[] doctorArray= {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getConsultationFee(),doctor.getRatings(),doctor.getExperience()};
	    jdbcTemplate.update(Queries.INSERTQUERY,doctorArray);
		
	}

	@Override
	public void updateDoctor(int doctorId, double consulationFee) {
		jdbcTemplate.update(Queries.UPDATEQUERY,doctorId);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
		
	}

	@Override
	public List<Doctor> findAll() {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTBYSPECIALITYQUERY,mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience)
			throws DoctorNotFoundException {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTBYSPECIALITYANDNAME,mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndFeesLessThan(String speciality, int consultationFees)
			throws DoctorNotFoundException {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTBYSPECIALITYANDFEEQUERY,mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndRating(String speciality, int ratings) throws DoctorNotFoundException {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTBYSPECIALITYANDRATINGSQUERY, mapper);
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		RowMapper<Doctor> mapper=new DoctorMapper();
		List<Doctor> doctors=jdbcTemplate.query(Queries.SELECTBYSPECIALITYANDNAME, mapper);
		return doctors;
	}

	@Override
	public Doctor findById(int doctorId) throws IdNotFoundException {
		return jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY, new DoctorMapper(), doctorId);
	}

	
}
