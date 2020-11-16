package com.nc.autumn2020;

import com.nc.autumn2020.lessonFileVisitor.FileVisitorSolution;
import com.nc.autumn2020.solutions.lesson5RandomProvider.RandomProviderSolution;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //task.run(args); // to launch com.nc.autumn2020.solutions.javaPractice3Homework
        // Не стирать
        //DynamicClassLoaderExample x = new DynamicClassLoaderExample();
        //x.executeSolution(args);
        RandomProviderSolution x = new RandomProviderSolution();
        try {
            x.executeSolution(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*FileVisitorSolution fileVisitorSolution = new FileVisitorSolution();
        fileVisitorSolution.executeSolution(args);*/
    }
}
