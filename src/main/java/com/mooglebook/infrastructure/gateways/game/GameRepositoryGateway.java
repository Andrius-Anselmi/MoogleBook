package com.mooglebook.infrastructure.gateways.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.domain.gateways.game.GameGateway;
import com.mooglebook.infrastructure.mapper.GameMapper;
import com.mooglebook.infrastructure.persistence.entities.GameEntity;
import com.mooglebook.infrastructure.persistence.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GameRepositoryGateway implements GameGateway {

    private final GameRepository repository;

    @Override
    public Game create(Game game){
        return GameMapper.toGame(repository.save(GameMapper.toEntity(game)));
    }

    @Override
    public List<Game> findAll(){
        return repository.findAll().stream().map(GameMapper::toGame).toList();
    }

    @Override
    public void delete(Long id) {
        Optional<GameEntity> byId = repository.findById(id);
        repository.delete(byId.get());
    }

    @Override
    public List<Game> filterByGenre(Genre genre) {
        return List.of();
    }

    @Override
    public List<Game> filterByStatus(Status status) {
        return List.of();
    }

    @Override
    public Game findById(Long id) {
        Optional<GameEntity> byId = repository.findById(id);
        return byId.map(GameMapper::toGame).orElse(null);
    }

    @Override
    public Game update(Long id, Game game) {
        return null;
    }

}
