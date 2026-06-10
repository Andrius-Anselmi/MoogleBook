package com.mooglebook.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "review")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private String review;

    @Column(nullable = false)
    LocalDateTime dateReview;

    @OneToOne
    @JoinColumn(name = "game_id", nullable = false)
    private GameEntity game;
}
