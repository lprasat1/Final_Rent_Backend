package io.springbootstarter.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rentIt.Spring.BO.RegisterUserBO;

@Repository
public interface RentItRepository extends JpaRepository<RegisterUserBO, Long> {
	
}
