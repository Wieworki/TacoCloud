package tacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotación que indica que este es una clase de configuracion, habilita la configuracion automatica y el escaneo de componentes
@SpringBootApplication
public class TacocloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacocloudApplication.class, args);
	}

}
