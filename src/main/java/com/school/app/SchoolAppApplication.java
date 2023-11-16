package com.school.app;

import com.school.app.dtos.StudentDTO;
import com.school.app.mapper.StudentMapper;
import com.school.app.models.Student;
import com.school.app.services.IStudentService;
import com.school.app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolAppApplication.class, args);
	}

	@Autowired
	IStudentService studentService;

	@Autowired
	StudentMapper studentMapper;

	@Bean
	CommandLineRunner init(){
		return args -> {

			Student student = studentService.findById(1L);

			StudentDTO studentDTO = studentMapper.toStudentDTO(student);

			System.out.println("studentDTO = " + studentDTO);
		};
	}

}
