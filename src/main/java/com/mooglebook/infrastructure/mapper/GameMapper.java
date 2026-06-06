package com.mooglebook.infrastructure.mapper;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.infrastructure.dtos.request.GameRequest;
import com.mooglebook.infrastructure.dtos.response.GameResponse;
import com.mooglebook.infrastructure.persistence.entities.GameEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameMapper {

    public static GameEntity toEntity(Game game){
        return GameEntity.builder()
                .id(game.id())
                .name(game.name())
                .genre(game.genre())
                .status(game.status())
                .studio(game.studio())
                .build();
    }

    public static Game toGame(GameEntity gameEntity){
        return Game.create(
                gameEntity.getId(),
                gameEntity.getName(),
                gameEntity.getGenre(),
                gameEntity.getStatus(),
                gameEntity.getStudio()
        );
    }

    public static Game toGame(GameRequest gameRequest){
        return Game.create(
                gameRequest.name(),
                gameRequest.genre(),
                gameRequest.status(),
                gameRequest.studio()
        );
    }

    public static GameResponse toResponse(Game game){
        return GameResponse.builder()
                .id(game.id())
                .name(game.name())
                .genre(game.genre())
                .status(game.status())
                .studio(game.studio())
                .build();
    }
}
