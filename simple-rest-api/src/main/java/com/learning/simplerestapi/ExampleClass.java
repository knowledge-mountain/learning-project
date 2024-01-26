package com.learning.simplerestapi;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExampleClass {
    @PostConstruct
    public void showSomething() {
        List<String> list = new ArrayList<>();
    }
}
