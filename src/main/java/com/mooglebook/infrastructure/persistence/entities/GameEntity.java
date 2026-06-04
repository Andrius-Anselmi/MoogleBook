package com.mooglebook.infrastructure.persistence.entities;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "game")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        @Column(nullable = false)
        String name;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        Genre genre;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        Status status;
        
        String studio;

        @OneToMany(mappedBy = "game")
        private List<GameSessionEntity> gameSession;

        @OneToOne(mappedBy = "game")
        private ReviewEntity review;

}
