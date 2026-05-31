package com.mooglebook.domain.entities;

import java.time.LocalDateTime;

public record GameSession(
        Long id,
        LocalDateTime sessionDate,
        Double duration,
        String annotation,
        Game game

) {
}
