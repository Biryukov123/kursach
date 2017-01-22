package com.example.dto;

import lombok.Data;

@Data
public class TeacherDto extends CooperatorDto {

    Integer hours;

    public String toString() {
        return super.toString() + "Количество часов " + hours + "    \n";
    }

}
