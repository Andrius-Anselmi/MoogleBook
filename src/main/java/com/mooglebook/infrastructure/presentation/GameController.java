package com.mooglebook.infrastructure.presentation;

import com.mooglebook.domain.usecases.game.CreateUseCase;
import com.mooglebook.domain.usecases.game.DeleteUseCase;
import com.mooglebook.domain.usecases.game.FindAllUseCase;
import com.mooglebook.domain.usecases.game.FindByIdUseCase;
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

    private final CreateUseCase createUseCase;
    private final FindAllUseCase findAllUseCase;
    private final FindByIdUseCase findByIdUseCase;
    private final DeleteUseCase deleteUseCase;

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


}
