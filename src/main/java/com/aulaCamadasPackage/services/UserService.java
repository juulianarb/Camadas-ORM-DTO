package com.aulaCamadasPackage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aulaCamadasPackage.dto.UserDTO;
import com.aulaCamadasPackage.entities.User;
import com.aulaCamadasPackage.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

}
