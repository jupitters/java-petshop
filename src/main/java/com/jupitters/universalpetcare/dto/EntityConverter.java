package com.jupitters.universalpetcare.dto;

import org.modelmapper.ModelMapper;

public class EntityConverter<T, D>{
    private ModelMapper modelMapper;

    public D mapEntityToDto(T entity, Class<D> dtoClass){
        return modelMapper.map(entity, dtoClass);
    }

    public T mapDtoToEntity(D dto, Class<T> entityClass){
        return modelMapper.map(dto, entityClass);
    }
}
