package com.example.dto;

import com.example.entity.Director;
import lombok.Data;

@Data
public class DirectorDto extends CooperatorDto {

    Integer countSubordinates;//количество подчиненных

    public PersonDto mapping(Director director) {
        this.countSubordinates = director.getCountSubordinates();
        return this;
    }

    public String toString() {
        return super.toString() + String.format("Количество подчиненных - %d    \n", countSubordinates);
    }
}
