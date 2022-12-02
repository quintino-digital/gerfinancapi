package digital.quintino.gerfinancapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerfinancapi.model.CartaoBancarioModel;

@Repository
public interface CartaoBancarioRepository extends JpaRepository<CartaoBancarioModel, Long> { }
