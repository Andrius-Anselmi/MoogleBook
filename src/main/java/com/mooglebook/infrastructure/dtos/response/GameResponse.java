package com.mooglebook.infrastructure.dtos.response;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import lombok.Builder;

@Builder
public record GameResponse(
        Long id,
        String name,
        Genre genre,
        Status status,
        String studio
) {

}
