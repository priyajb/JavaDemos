package com.insuranceapp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringInsuranceappRestmybatisApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatisApplication.class, args);
	}

//	@Autowired
//	IInsuranceService insuranceService;

//	@Override
//	public void run(String... args) throws Exception {
//		Insurance insurance=new Insurance(105, "vvv", "vfislk", "wealth", 12, 18000);
//        insuranceService.addInsurance(insurance);
//        //insuranceService.updateInsurance(103,14000);
//	}

}
