package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.mappers.ICarMapper;
import app.models.Car;

@SpringBootApplication
public class MybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringbootApplication.class, args);
	}
	
}
