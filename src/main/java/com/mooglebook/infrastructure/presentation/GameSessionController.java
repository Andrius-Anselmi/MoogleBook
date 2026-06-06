package com.mooglebook.infrastructure.presentation;

import com.mooglebook.domain.dtos.CreateGameSessionInput;
import com.mooglebook.domain.usecases.gamesession.*;
import com.mooglebook.infrastructure.dtos.response.GameSessionResponse;
import com.mooglebook.infrastructure.mapper.GameSessionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/gamesession")
@RequiredArgsConstructor
public class GameSessionController {

    private final CreateGameSessionUseCase createGameSessionUseCase;
    private final FindAllGameSessionsUseCase findAllGameSessionsUseCase;
    private final FindGameSessionByIdUseCase findGameSessionByIdUseCase;
    private final DeleteGameSessionUseCase deleteGameSessionUseCase;
    private final FilterGameSessionsByDateUseCase filterGameSessionsByDateUseCase;

    @PostMapping()
    public ResponseEntity<GameSessionResponse> create(@RequestBody CreateGameSessionInput request){
        return ResponseEntity.ok().
                body(GameSessionMapper.toResponse(createGameSessionUseCase.
                        execute(request)));
    }

    @GetMapping()
    public ResponseEntity<List<GameSessionResponse>> findAll(){
        return ResponseEntity.ok().body(findAllGameSessionsUseCase.execute()
                .stream().map(GameSessionMapper::toResponse).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameSessionResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(GameSessionMapper.toResponse(findGameSessionByIdUseCase.execute(id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        deleteGameSessionUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/filter/{sessionDate}")
    public ResponseEntity<List<GameSessionResponse>> findBySessionData(@PathVariable LocalDateTime sessionDate){
        return ResponseEntity.ok().body(filterGameSessionsByDateUseCase.execute(sessionDate).stream().map(GameSessionMapper::toResponse).toList());
    }


}
