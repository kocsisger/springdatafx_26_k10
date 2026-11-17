package hu.unideb.inf.springdatafx_k10.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findDistinctFirstByDateOfBirth_Day(short dateOfBirthDay);
}