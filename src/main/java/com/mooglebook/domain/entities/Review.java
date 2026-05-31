package com.mooglebook.domain.entities;

import java.time.LocalDateTime;

public record Review(
        Long id,
        int rating,
        String review,
        LocalDateTime dateReview,
        Game game

) {
}
