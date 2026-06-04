package com.mooglebook.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "game_session")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameSessionEntity {

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
    private GameEntity game;


}
