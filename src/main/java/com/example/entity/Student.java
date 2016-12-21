package com.example.entity;

import com.example.dto.PersonDto;
import com.example.dto.StudentDto;
import lombok.Data;

@Data

public class Student extends Person {
    String group;
    Integer numberRecordBook;

    public Student(Integer id, String surname, String name, Integer age, String group, Integer numberRecordBook) {
        super(id, surname, name, age);
        this.group = group;
        this.numberRecordBook = numberRecordBook;
    }

    @Override
    public PersonDto mapping() {
        StudentDto studentDto = new StudentDto();
        super.map(this, studentDto);
        studentDto.setGroup(this.getGroup());
        studentDto.setNumberRecordBook(this.getNumberRecordBook());
        return studentDto;
    }

}
