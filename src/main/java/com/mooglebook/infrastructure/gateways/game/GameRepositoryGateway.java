package com.mooglebook.infrastructure.gateways.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.domain.exception.DuplicateGameException;
import com.mooglebook.domain.gateways.game.GameGateway;
import com.mooglebook.infrastructure.mapper.GameMapper;
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
    public Game create(Game game) throws DuplicateGameException {
        return GameMapper.toGame(repository.save(GameMapper.toEntity(game)));
    }

    @Override
    public List<Game> findAll(){
        return repository.findAll().stream().map(GameMapper::toGame).toList();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Game> filterByGenre(Genre genre) {
        return repository.findGameByGenre(genre).stream()
                .map(GameMapper::toGame).toList();
    }

    @Override
    public List<Game> filterByStatus(Status status) {
        return repository.findGameByStatus(status).stream()
                .map(GameMapper::toGame).toList();
    }

    @Override
    public Optional<Game> findById(Long id) {
        return repository.findById(id).map(GameMapper::toGame);
    }

    @Override
    public Game update(Long id, Game game) {
        return null;
    }

    @Override
    public Optional<Game> findGameByName(String name) {
        return repository.findGameByName(name).map(GameMapper::toGame);
    }

}
