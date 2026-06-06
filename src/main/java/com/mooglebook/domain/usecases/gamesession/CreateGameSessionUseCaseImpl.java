package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.dtos.CreateGameSessionInput;
import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.gateways.game.GameGateway;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

public class CreateGameSessionUseCaseImpl implements CreateGameSessionUseCase {

    private final GameSessionGateway gateway;
    private final GameGateway gameGateway;

    public CreateGameSessionUseCaseImpl(GameSessionGateway gateway, GameGateway gameGateway){
        this.gateway = gateway;
        this.gameGateway = gameGateway;
    }


    @Override
    public GameSession execute(CreateGameSessionInput gameSession) {
        Game game = gameGateway.findById(gameSession.game()).orElseThrow(
                () -> new NotFoundGameException("Game not found")
        );

        GameSession newGameSession = new GameSession(null, gameSession.sessionDate(), gameSession.duration(), gameSession.annotation(), game);

        return gateway.create(newGameSession);

    }
}
