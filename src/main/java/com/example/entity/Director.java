package com.example.entity;

import com.example.dto.DirectorDto;
import com.example.dto.PersonDto;
import lombok.Data;

@Data
public class Director extends Cooperator {

    Integer countSubordinates;//количество подчиненных

    public Director(Integer id, String surname, String name, Integer age, Integer experience, Integer salary, Integer countSubordinates) {
        super(id, surname, name, age, experience, salary);
        this.countSubordinates = countSubordinates;
    }

    @Override
    public PersonDto mapping() {
        DirectorDto directorDto = new DirectorDto();
        super.map(this, directorDto);
        directorDto.setCountSubordinates(this.getCountSubordinates());
        return directorDto;
    }
}
