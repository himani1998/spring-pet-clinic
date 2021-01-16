package himani.spring.pet.springpetclinic;

import himani.spring.pet.springpetclinic.exampleBeans.FakeDataSource;
import himani.spring.pet.springpetclinic.exampleBeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SpringPetClinicApplication.class, args);
		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		FakeJmsBroker fakeJmsBroker=(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}

}
