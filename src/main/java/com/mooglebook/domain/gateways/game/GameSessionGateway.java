package com.mooglebook.domain.gateways.game;

import com.mooglebook.domain.entities.GameSession;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface GameSessionGateway {

    GameSession create(GameSession gameSession);
    void delete(Long id);
    List<GameSession> findAll();
    Optional<GameSession> findById(Long id);
    List<GameSession> findGamesBySessionDate(LocalDateTime sessionDate);

}
