package com.mooglebook.infrastructure.config;

import com.mooglebook.domain.gateways.game.GameGateway;
import com.mooglebook.domain.usecases.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUseCase createUseCase(GameGateway gateway){
        return new CreateUseCaseImpl(gateway);
    }

    @Bean
    public FindAllUseCase findAllUseCase(GameGateway gateway){
        return new FindAllUseCaseImpl(gateway);
    }

    @Bean
    public FindByIdUseCase findByIdUseCase(GameGateway gateway){
        return new FindByIdUseCaseImpl(gateway);
    }

    @Bean
    public DeleteUseCase deleteUseCase(GameGateway gateway){
        return new DeleteUseCaseImpl(gateway);
    }
}
