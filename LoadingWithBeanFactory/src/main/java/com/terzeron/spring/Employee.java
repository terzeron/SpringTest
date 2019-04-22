package com.terzeron.spring;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String name;
    private String empId;
    private Address address;
}
