package com.mooglebook.infrastructure.persistence.repository;

import com.mooglebook.infrastructure.persistence.entities.GameReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameReviewRepository extends JpaRepository<GameReviewEntity, Long> {
}
