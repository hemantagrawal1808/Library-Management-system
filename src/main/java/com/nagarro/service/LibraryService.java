package com.nagarro.service;


import com.nagarro.entity.Library;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.repository.LibraryRepository;
@Service
public class LibraryService {

	@Autowired
	private LibraryRepository repo;
	
	public void addLib(Library l) {
		
		repo.save(l);
	}

	public java.util.List<Library> getAllLib()
	{
		return repo.findAll();
	}
	public Library getLibById(int code) {
		java.util.Optional<Library> l=repo.findById(code);
		if(l.isPresent()) {
			return l.get();
		}
		return null;
	}
	
	public void deleteLib(int code) {
		repo.deleteById(code);
	}

}
