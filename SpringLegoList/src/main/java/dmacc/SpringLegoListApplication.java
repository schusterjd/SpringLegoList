package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.LegoSets;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.LegoRepository;

@SpringBootApplication
public class SpringLegoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringLegoListApplication.class, args);
		
	}
	
	@Autowired
	LegoRepository repo;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Using an existing bean
		LegoSets c = appContext.getBean("set", LegoSets.class);
		c.setName("Sentry");
		repo.save(c);
		List<LegoSets> allMySets = repo.findAll();
		for(LegoSets set: allMySets) {
			System.out.println(set.toString());
		}
		
		((AbstractApplicationContext) appContext).close();

	}
	
}
