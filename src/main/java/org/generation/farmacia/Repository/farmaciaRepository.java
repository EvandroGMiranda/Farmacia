package org.generation.farmacia.Repository;

import java.util.List;
import org.generation.farmacia.model.farmaciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface farmaciaRepository extends JpaRepository<farmaciaModel, Long> {
		public List<farmaciaModel>findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
