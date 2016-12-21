package com.example.dto;

import lombok.Data;

@Data


public abstract class CooperatorDto extends PersonDto {

    // int salary; // зарплата
    Integer experience; // стаж

    public String toString() {
        return super.toString() + String.format("Стаж - %d    \n", experience);
    }


}
