package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.Modelpojo;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("hi sandeep");
		System.out.println("hello SSTA");
	}

	@Override
	public void run(String... args) throws Exception {

		Modelpojo modelpojo = new Modelpojo();
		modelpojo.setCourse("Spring course");
		modelpojo.setName("Sandeep");
		modelpojo.setTutor("Harshit chudary");
		//System.out.println("Modelpojo object" + modelpojo);
		System.out.println("Modelpojo object course name " + modelpojo.getCourse());
		System.out.println("Modelpojo object course name " + modelpojo.getName());
		System.out.println("Modelpojo object course name " + modelpojo.getTutor());
	}

}
