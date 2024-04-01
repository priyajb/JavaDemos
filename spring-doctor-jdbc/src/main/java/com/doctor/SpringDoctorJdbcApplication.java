package com.doctor;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctor.model.Doctor;
import com.doctor.service.DoctorServiceImpl;
import com.doctor.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorJdbcApplication.class, args);
	}
	
	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		//IDoctorService doctorService = new DoctorServiceImpl();
//      Specialization specialization = Specialization.GYNO;
//      String speciality = specialization.toString();
      try(Scanner sc = new Scanner(System.in)){
          System.out.println("1.Get all doctors\n"
                  + "2.Add doctor\n"
                  + "3.Update doctor by fees and id\n"
                  + "4.Delete doctor by id\n"
                  + "5.Get doctor by doctorId\n"
                  + "6.Get the doctor by speciality\n"
                  + "7.Get the doctor by speciality and exp\n"
                  + "8.Get the doctor with speciality and fees less than\n"
                  + "9.Get doctors with speciality and rating\n"
                  + "10.Get doctor with speciality and name containing");
          System.out.println("--------Enter your choice number--------");
          int choice = sc.nextInt();
          switch (choice) {
              case 1:
                  System.out.println("***** List of all doctors *****");
                  List<Doctor> doctors = doctorService.getAll();
                  for (Doctor doctor : doctors)
                      System.out.println(doctor);
                  break;
              case 2:
                  System.out.println("***** Creating a new doctor record *****");
                  System.out.println("Enter the doctor name:");
                  String name = sc.next();
                  System.out.println("Enter the doctor speciality:");
                  String spec = sc.next();
                  System.out.println("Enter the doctor consultation Fee:");
                  double fee = sc.nextDouble();
                  System.out.println("Enter the doctor ratings:");
                  int ratings = sc.nextInt();
                  System.out.println("Enter the doctor experience:");
                  int exp = sc.nextInt();
                  doctorService.addDoctor(new Doctor(ratings, name,spec,fee,ratings,exp));
                  break;
              case 3:
                  System.out.println("***** Creating a new doctor record *****");
                  System.out.println("Enter the doctor id:");
                  int dId = sc.nextInt();
                  System.out.println("Enter the doctor's updated consultation fee:");
                  double conFee = sc.nextDouble();
                  doctorService.updateDoctor(dId, conFee);
                  break;
              case 4:
                  System.out.println("***** Deleting a new doctor record *****");
                  int docId = sc.nextInt();
                  doctorService.deleteDoctor(docId);
                  break;
              case 5:
                  System.out.println("***** Fetching a doctor record *****");
                  System.out.println("Enter the doctor id: ");
                  int doId = sc.nextInt();
                  System.out.println(doctorService.getById(doId));
                  break;
              case 6:
                  System.out.println("***** Deleting a doctor record *****");
                  System.out.println("Enter the doctor specialization: ");
                  String speciality = sc.next();
                  for(Doctor doctorBySpec : doctorService.getBySpeciality(speciality))
                      System.out.println(doctorBySpec);
                  break;
              case 7:

                  break;
              case 8:
                  break;
              case 9:
                  break;
              default:
                  System.out.println("Invalid Input");
                  break;
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
		
}
