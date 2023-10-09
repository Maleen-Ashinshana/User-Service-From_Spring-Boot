package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProposedTravelPlanningSystemBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProposedTravelPlanningSystemBackEndApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
