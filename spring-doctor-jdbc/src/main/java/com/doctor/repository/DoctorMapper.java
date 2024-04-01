package com.doctor.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.doctor.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		doctor.setDoctorName(rs.getString("doctor_name"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setRatings(rs.getInt("ratings"));
		doctor.setConsultationFee(rs.getDouble("fees"));
		doctor.setExperience(rs.getInt("experience"));
	
		return doctor;
		
	}
	

}
