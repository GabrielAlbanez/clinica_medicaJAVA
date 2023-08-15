package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Doctor;

public interface DoctorsInterface extends JpaRepository<Doctor, Long> {

	
}
