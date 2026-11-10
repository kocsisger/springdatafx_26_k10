package hu.unideb.inf.springdatafx_k10;

import hu.unideb.inf.springdatafx_k10.model.Person;
import hu.unideb.inf.springdatafx_k10.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxK10Application implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataFxK10Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Person person = new Person();
        person.setName("Kis Béla");
        person.setDateOfBirth(LocalDate.of(2002,11,10));*/

        Person person = Person.builder()
                            .name("Nap Pali")
                            .dateOfBirth(LocalDate.of(2003,12,5))
                        .build();

        personRepository.save(person);
    }
}
