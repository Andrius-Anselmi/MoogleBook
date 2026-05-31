package com.mooglebook.domain.usecases.review;

import com.mooglebook.domain.entities.Review;

public interface FindByIdUseCase {

    Review execute(Long id);
}
