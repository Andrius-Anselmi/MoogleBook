package com.mooglebook.infrastructure.persistence.repository;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.infrastructure.persistence.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {

    Optional<GameEntity> findGameByName(String name);
}
