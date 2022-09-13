package com.cydeo.yummy.model;

import com.cydeo.yummy.enums.QuantityType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredients {
    private String name;
    private QuantityType quantityType;
    private int quantity;
}
