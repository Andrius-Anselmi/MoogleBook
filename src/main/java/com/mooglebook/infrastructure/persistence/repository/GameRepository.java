package com.mooglebook.infrastructure.persistence.repository;

import com.mooglebook.infrastructure.persistence.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {
}
