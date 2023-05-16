package com.example.libB;

import com.example.lib.WRCar;
//import com.google.common.base.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibBApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LibBApplication.class, args);
		WRCar car = new WRCar(45);
//		System.out.println(Strings.repeat("hi", 3));
//		Strings.repeat("hi", 4);


	}

}
