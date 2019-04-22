package com.terzeron.spring;

import lombok.Data;

@Data
public class CustomerService {
    String message;

    public void init() throws Exception {
        System.out.println("init method after property are set: " + message);
    }

    public void clean() throws Exception {
        System.out.println("spring container cleaned up.");
    }
}
