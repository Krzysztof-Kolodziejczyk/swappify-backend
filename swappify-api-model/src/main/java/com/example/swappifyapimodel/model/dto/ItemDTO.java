package com.example.swappifyapimodel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItemDTO {

    String name;

    BigDecimal price;

    String uuid;
}
