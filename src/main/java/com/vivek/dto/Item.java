package com.vivek.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT) //map only non null field and exclude null field
public class Item {

    private int id;
    private String name;
    private String category;
    private Float price;
    private Integer stock;
}
