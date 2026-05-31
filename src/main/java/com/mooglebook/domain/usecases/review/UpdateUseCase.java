package com.mooglebook.domain.usecases.review;

import com.mooglebook.domain.entities.Review;

public interface UpdateUseCase {

    Review execute(Long id);
}
