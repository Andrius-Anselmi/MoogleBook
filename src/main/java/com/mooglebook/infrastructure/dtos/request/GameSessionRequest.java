package com.mooglebook.infrastructure.dtos.request;

import java.time.LocalDateTime;

public record GameSessionRequest(
        LocalDateTime sessionDate,
        Double duration,
        String annotation,
        Long game
) {
}
