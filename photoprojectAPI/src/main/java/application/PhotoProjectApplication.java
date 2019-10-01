package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class PhotoProjectApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("@NUEVO Entra en aplicación main");
		SpringApplication.run(PhotoProjectApplication.class, args);
	}

}
