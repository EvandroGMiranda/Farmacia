package org.generation.farmacia.Repository;

import java.util.List;
import org.generation.farmacia.model.farmaciaTema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface farmaciaTemaRepository extends JpaRepository<farmaciaTema, Long> {
	public List<farmaciaTema> findAllByDescricaoContainingIgnoreCase(@Param("Descricao")String descricao );
}


