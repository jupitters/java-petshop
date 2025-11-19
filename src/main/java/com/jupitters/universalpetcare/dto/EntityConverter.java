package com.jupitters.universalpetcare.dto;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EntityConverter{
    private final ModelMapper modelMapper;

    public <D> D mapEntityToDto(Object entity, Class<D> dtoClass){
        return modelMapper.map(entity, dtoClass);
    }

    public <T> T mapDtoToEntity(Object dto, Class<T> entityClass){
        return modelMapper.map(dto, entityClass);
    }
}
