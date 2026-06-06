package com.mooglebook.infrastructure.persistence.repository;

import com.mooglebook.infrastructure.persistence.entities.GameSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GameSessionRepository extends JpaRepository<GameSessionEntity, Long> {

    List<GameSessionEntity> findGameSessionEntitiesBySessionDate(LocalDateTime sessionDate);
}
