package com.mooglebook.domain.entities;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;

import java.util.List;

public record Game(
        Long id,
        String name,
        Genre genre,
        Status status,
        String studio,
        List<GameSession> gameSession,
        Review review
) {

    public static Game create(String name, Genre genre, Status status, String studio){
        return new Game(null, name,genre,status,studio,null,null);
    }

    public static Game create(Long id){
        return new Game(id,null, null, null, null, null, null);
    }

    public static Game create(Long id, String name, Genre genre, Status status, String studio){
        return new Game(id,name,genre,status,studio, null, null);
    }
}
