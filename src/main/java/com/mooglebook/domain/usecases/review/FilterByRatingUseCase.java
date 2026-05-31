package com.mooglebook.domain.usecases.review;

import com.mooglebook.domain.entities.Review;

import java.util.List;

public interface FilterByRatingUseCase {

    List<Review> execute(int rating);
}
