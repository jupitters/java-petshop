package com.jupitters.universalpetcare.dto;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EntityConverter<T, D>{
    private final ModelMapper modelMapper;


}
