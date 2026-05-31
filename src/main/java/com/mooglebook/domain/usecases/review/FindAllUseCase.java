package com.mooglebook.domain.usecases.review;

import com.mooglebook.domain.entities.Review;

import java.util.List;

public interface FindAllUseCase {

    List<Review> execute();
}
