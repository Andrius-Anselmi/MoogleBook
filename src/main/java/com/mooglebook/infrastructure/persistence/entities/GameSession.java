package com.mooglebook.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "game_session")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime sessionDate;

    @Column(nullable = false)
    private Double duration;

    private String annotation;

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;


}
