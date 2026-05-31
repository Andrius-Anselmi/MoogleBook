package com.mooglebook.domain.entities;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;

public record Game(
        Long id,
        String name,
        Genre genre,
        Status status,
        String studio
) {
}
