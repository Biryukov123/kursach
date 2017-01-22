package com.example.dto;

import lombok.Data;

@Data


public abstract class CooperatorDto extends PersonDto {

    Integer experience;

    public String toString() {
        return super.toString() + String.format("Работал лет %d    \n", experience);
    }


}
