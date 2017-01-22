package com.example.dto;

import lombok.Data;

@Data

public class StudentDto extends PersonDto {
    String group;
    Integer recordBook;


    public String toString() {
        return super.toString() + String.format("Группа %s    Номер зачетной книжки %d    \n", group, recordBook);
    }


}
