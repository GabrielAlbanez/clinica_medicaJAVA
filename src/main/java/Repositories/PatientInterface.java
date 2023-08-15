package Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Patient;


public interface PatientInterface extends JpaRepository<Patient, Long> {

}
