package digital.quintino.gerfinancapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import digital.quintino.gerfinancapi.model.CartaoBancarioModel;
import digital.quintino.gerfinancapi.service.CartaoBancarioService;

@RestController
@RequestMapping("/api/v1/cartao-bancario")
public class CartaoBancarioController {
	
	@Autowired
	private CartaoBancarioService cartaoBancarioService;
	
	@GetMapping
	public List<CartaoBancarioModel> findAll() {
		return this.cartaoBancarioService.findAll();
	}

}
