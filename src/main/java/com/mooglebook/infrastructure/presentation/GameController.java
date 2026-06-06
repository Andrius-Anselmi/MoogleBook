package com.mooglebook.infrastructure.presentation;

import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.domain.usecases.game.*;
import com.mooglebook.infrastructure.dtos.request.GameRequest;
import com.mooglebook.infrastructure.dtos.response.GameResponse;
import com.mooglebook.infrastructure.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/game")
@RequiredArgsConstructor
public class GameController {

    private final CreateGameUseCase createUseCase;
    private final FindAllGamesUseCase findAllUseCase;
    private final FindGameByIdUseCase findByIdUseCase;
    private final DeleteGameUseCase deleteUseCase;
    private final FilterGameByGenreUseCase filterByGenreUseCase;
    private final FilterGameByStatusUseCase filterByStatusUseCase;
    private final FindGameByNameUseCase findByNameUseCase;

    @PostMapping()
    public ResponseEntity<GameResponse> create(@RequestBody GameRequest request){
        return ResponseEntity.ok().body(GameMapper.toResponse(createUseCase.execute(GameMapper.toGame(request))));
    }

    @GetMapping()
    public ResponseEntity<List<GameResponse>> findAll(){
        return ResponseEntity.ok().body(findAllUseCase.execute().stream().map(GameMapper::toResponse).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(GameMapper.toResponse(findByIdUseCase.execute(id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        deleteUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/filter/genre/{genre}")
    public ResponseEntity<List<GameResponse>> filterByGenre(@PathVariable Genre genre){
        return ResponseEntity.ok().body(filterByGenreUseCase.execute(genre).stream()
                .map(GameMapper::toResponse).toList());
    }

    @GetMapping("/filter/status/{status}")
    public ResponseEntity<List<GameResponse>> filterByStatus(@PathVariable Status status){
        return ResponseEntity.ok().body(filterByStatusUseCase.execute(status).stream()
                .map(GameMapper::toResponse).toList());
    }

    @GetMapping("/filter/name/{name}")
    public ResponseEntity<GameResponse> findByName(@PathVariable String name){
        return ResponseEntity.ok().body(GameMapper.toResponse(findByNameUseCase.execute(name)));
    }


}
