package com.mooglebook.infrastructure.mapper;

import com.mooglebook.domain.dtos.CreateGameSessionInput;
import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.infrastructure.dtos.request.GameSessionRequest;
import com.mooglebook.infrastructure.dtos.response.GameSessionResponse;
import com.mooglebook.infrastructure.persistence.entities.GameSessionEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameSessionMapper {

    public static GameSessionResponse toResponse(GameSession gameSession){

        return GameSessionResponse.builder()
                .id(gameSession.id())
                .sessionDate(gameSession.sessionDate())
                .duration(gameSession.duration())
                .annotation(gameSession.annotation())
                .game(GameMapper.toResponse(gameSession.game()))
                .build();
    }

    public static GameSessionEntity toEntity(GameSession gameSession){
        return GameSessionEntity.builder()
                .id(gameSession.id())
                .sessionDate(gameSession.sessionDate())
                .duration(gameSession.duration())
                .annotation(gameSession.annotation())
                .game(GameMapper.toEntity(gameSession.game()))
                .build();
    }

    public static GameSession toGameSession(GameSessionEntity entity){
        return new GameSession(
                entity.getId(),
                entity.getSessionDate(),
                entity.getDuration(),
                entity.getAnnotation(),
                GameMapper.toGame(entity.getGame())

        );
    }

    public static CreateGameSessionInput toCreateGameSessionInput(GameSessionRequest request){
        return new CreateGameSessionInput(
                request.sessionDate(),
                request.duration(),
                request.annotation(),
                request.game()
        );
    }
}
