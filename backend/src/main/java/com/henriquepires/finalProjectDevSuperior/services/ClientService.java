package com.henriquepires.finalProjectDevSuperior.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.henriquepires.finalProjectDevSuperior.dto.ClientDTO;
import com.henriquepires.finalProjectDevSuperior.entities.Client;
import com.henriquepires.finalProjectDevSuperior.repositories.ClientRepository;
import com.henriquepires.finalProjectDevSuperior.services.exceptions.ResourceNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public Page<ClientDTO> findAll(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}

	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		return new ClientDTO(entity);
	}

	public ClientDTO insert(ClientDTO dto) {

		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = repository.getReferenceById(id);
			entity.setName(dto.getName());
			entity.setCpf(dto.getCpf());
			entity.setIncome(dto.getIncome());
			entity.setBirthDate(dto.getBirthDate());
			entity.setChildren(dto.getChildren());
			entity = repository.save(entity);
			return new ClientDTO(entity);
		} catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}

	}

	public void delete(Long id) {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Id not found: " + id);
		}
	}

}
