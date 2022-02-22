package com.juliet.petshop.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.juliet.petshop.domain.Categoria;
import com.juliet.petshop.repository.CategoriaRepository;
@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
