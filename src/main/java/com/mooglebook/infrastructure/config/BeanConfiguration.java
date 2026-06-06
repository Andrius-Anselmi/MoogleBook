package com.mooglebook.infrastructure.config;

import com.mooglebook.domain.gateways.game.GameGateway;
import com.mooglebook.domain.gateways.game.GameSessionGateway;
import com.mooglebook.domain.usecases.game.*;
import com.mooglebook.domain.usecases.gamesession.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateGameUseCase createUseCase(GameGateway gameGateway){
        return new CreateGameUseCaseImpl(gameGateway);
    }

    @Bean
    public FindAllGamesUseCase findAllUseCase(GameGateway gameGateway){
        return new FindAllGamesUseCaseImpl(gameGateway);
    }

    @Bean
    public FindGameByIdUseCase findByIdUseCase(GameGateway gameGateway){
        return new FindGameByIdUseCaseImpl(gameGateway);
    }

    @Bean
    public DeleteGameUseCase deleteUseCase(GameGateway gameGateway){
        return new DeleteGameUseCaseImpl(gameGateway);
    }

    @Bean
    public FindGameByNameUseCase findByNameUseCase(GameGateway gameGateway){
        return new FindGameByNameUseCaseImpl(gameGateway);
    }

    @Bean
    public FilterGameByGenreUseCase filterByGenreUseCase(GameGateway gameGateway){
        return new FilterGameByGenreUseCaseImpl(gameGateway);
    }

    @Bean
    public FilterGameByStatusUseCase filterByStatusUseCase(GameGateway gameGateway){
        return new FilterGameByStatusUseCaseImpl(gameGateway);
    }

    @Bean
    public CreateGameSessionUseCase createGameSessionUseCase(GameSessionGateway gameSessionGateway, GameGateway gameGateway){
        return new CreateGameSessionUseCaseImpl(gameSessionGateway, gameGateway);
    }

    @Bean
    public FindAllGameSessionsUseCase findAllGameSessionsUseCase(GameSessionGateway gameSessionGateway){
        return new FindAllGameSessionsUseCaseImpl(gameSessionGateway);
    }

    @Bean
    public FindGameSessionByIdUseCase findGameSessionByIdUseCase(GameSessionGateway gameSessionGateway){
        return new FindGameSessionByIdUseCaseImpl(gameSessionGateway);
    }

    @Bean
    public DeleteGameSessionUseCase deleteGameSessionUseCase(GameSessionGateway gameSessionGateway){
        return new DeleteGameSessionUseCaseImpl(gameSessionGateway);
    }

    @Bean
    public FilterGameSessionsByDateUseCase filterGameSessionsByDateUseCase(GameSessionGateway gameSessionGateway){
        return new FilterGameSessionsByDateUseCaseImpl(gameSessionGateway);
    }

}
