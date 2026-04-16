package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    // Logic to generate Fibonacci series up to n terms
    public List<Integer> generateFibonacci(int n) {
        List<Integer> series = new ArrayList<>();
        int n1 = 0, n2 = 1;
        
        for (int i = 0; i < n; i++) {
            series.add(n1);
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
        return series;
    }

    public static void main(String[] args) {
        App obj = new App();
        int terms = 10;
        System.out.println("Fibonacci Series (" + terms + " terms): " + obj.generateFibonacci(terms));
    }
}