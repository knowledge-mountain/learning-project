package com.learning.simplerestapi;

public class Main {
    public static void main(String[] args) {
        var annotations = MagicClass.class.getAnnotations();
        System.out.println("Annotations:");
        for (var annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
