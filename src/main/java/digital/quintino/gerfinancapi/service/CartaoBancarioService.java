package digital.quintino.gerfinancapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.quintino.gerfinancapi.model.CartaoBancarioModel;
import digital.quintino.gerfinancapi.repository.CartaoBancarioRepository;

@Service
public class CartaoBancarioService {
	
	@Autowired
	private CartaoBancarioRepository cartaoBancarioRepository;
	
	public List<CartaoBancarioModel> findAll() {
		return this.cartaoBancarioRepository.findAll();
	}

}
