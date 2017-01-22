package com.example.dto;

import com.example.entity.Manager;
import lombok.Data;

@Data
public class ManagerDto extends CooperatorDto {

    Integer countCooperator;

    public String toString() {
        return super.toString() + String.format("Количество сотрудников %d    \n", countCooperator);
    }
}
