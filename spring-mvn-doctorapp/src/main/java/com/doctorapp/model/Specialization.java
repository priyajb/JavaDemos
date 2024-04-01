package com.doctorapp.model;

public enum Specialization {
	

	ORTHO("ORTHOPEDIST"),
    PEDIA(""),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNO("GYNECOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST");

    private String speciality;
    Specialization(String speciality) {
        this.speciality = speciality;
    }
    public String getSpeciality(){
        return speciality;
    }
}
