package com.doctor.util;

public class Queries {
	public static final String INSERTQUERY = "Insert into doctor (doctor_name, speciality, fee, ratings, experience) values (?,?,?,?,?);";
    public static final String UPDATEQUERY = "Update doctor set fee=? where doctor_id=?";
    public static final String DELETEQUERY = "Delete from doctor where doctor_id=?";

    public static final String SELECTQUERY = "Select * from doctor";

    public static final String SELECTBYSPECIALITYQUERY = "Select * from doctor where speciality=?";
    public static final String SELECTBYSPECIALITYANDEXPQUERY = "Select * from doctor where speciality=? and experience>?";
    public static final String SELECTBYSPECIALITYANDFEEQUERY = "Select * from doctor where speciality=? fee<?";
    public static final String SELECTBYSPECIALITYANDRATINGSQUERY = "Select * from doctor where speciality=? and ratings>=?";
    public static final String SELECTBYSPECIALITYANDNAME = "Select * from doctor where speciality=? and doctor_name like '%?%'";
    public static final String SELECTBYIDQUERY = "Select * from doctor where doctor_id=?";

}
