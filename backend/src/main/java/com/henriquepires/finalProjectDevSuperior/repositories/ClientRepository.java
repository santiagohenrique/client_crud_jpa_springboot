package com.henriquepires.finalProjectDevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquepires.finalProjectDevSuperior.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
