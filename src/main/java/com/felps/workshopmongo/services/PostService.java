package com.felps.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felps.workshopmongo.domain.Post;
import com.felps.workshopmongo.repository.PostRepository;
import com.felps.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
}
	
	