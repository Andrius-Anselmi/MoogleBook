package com.mooglebook.infrastructure.dtos.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record GameSessionResponse(
        Long id,
        LocalDateTime sessionDate,
        Double duration,
        String annotation,
        GameResponse game
) {
}
