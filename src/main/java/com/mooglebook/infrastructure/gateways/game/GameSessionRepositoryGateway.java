package com.mooglebook.infrastructure.gateways.game;

import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.gateways.game.GameSessionGateway;
import com.mooglebook.infrastructure.mapper.GameSessionMapper;
import com.mooglebook.infrastructure.persistence.repository.GameSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Component
public class GameSessionRepositoryGateway implements GameSessionGateway {

    private final GameSessionRepository repository;

    @Override
    public GameSession create(GameSession gameSession) {
        return GameSessionMapper.toGameSession(repository.save(GameSessionMapper.toEntity(gameSession)));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<GameSession> findAll() {
        return repository.findAll().stream().map(GameSessionMapper::toGameSession).toList();
    }

    @Override
    public Optional<GameSession> findById(Long id) {
        return repository.findById(id).map(GameSessionMapper::toGameSession);
    }

    @Override
    public List<GameSession> findGamesBySessionDate(LocalDateTime sessionDate) {
        return repository.findGameSessionEntitiesBySessionDate(sessionDate).stream().map(GameSessionMapper::toGameSession).toList();
    }
    
}
