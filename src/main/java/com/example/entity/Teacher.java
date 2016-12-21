package com.example.entity;

import com.example.dto.PersonDto;
import com.example.dto.TeacherDto;
import lombok.Data;

@Data


public class Teacher extends Cooperator {

    Integer countHours; //количество часов

    public Teacher(Integer id, String surname, String name, Integer age, Integer experience, Integer salary, Integer countHours) {
        super(id, surname, name, age, experience, salary);
        this.countHours = countHours;
    }


    @Override
    public PersonDto mapping() {
        TeacherDto teacherDto = new TeacherDto();
        super.map(this, teacherDto);
        teacherDto.setCountHours(this.getCountHours());
        return teacherDto;
    }
}
