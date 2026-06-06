package com.mooglebook.infrastructure.persistence.repository;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.infrastructure.persistence.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {

    Optional<GameEntity> findGameByName(String name);

    List<GameEntity> findGameByGenre(Genre genre);

    List<GameEntity> findGameByStatus(Status status);
}
