package com.example.dto;

import com.example.entity.Schoolkid;
import lombok.Data;

@Data

public class SchoolkidDto extends PersonDto {

    String number;

    public PersonDto mapping(Schoolkid schoolkid) {
        this.number = schoolkid.getNumber();
        return this;
    }

    public String toString() {
        return super.toString() + String.format("Класс %s    \n", number);
    }

}
