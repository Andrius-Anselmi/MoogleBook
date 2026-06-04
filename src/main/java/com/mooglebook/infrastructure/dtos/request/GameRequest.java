package com.mooglebook.infrastructure.dtos.request;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;

public record GameRequest(
        String name,
        Genre genre,
        Status status,
        String studio
) {
}
