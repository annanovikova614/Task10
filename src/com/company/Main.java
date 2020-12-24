package com.company;

import com.company.Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/com/company/Tests/input.txt");
        Scanner scanner = new Scanner(file);
        List<Box> list = new ArrayList<>();
        readBoxes(scanner, list);
        List<Box> sourceList = getSourceListForOutputOnConsole(list);
        List<Box> finalList = Logic.process(list);
        printResultToConsole(sourceList, finalList);
        printResultToFile(finalList);
    }

    public static void printResultToConsole(List<Box> sourceList, List<Box> finalList) {
        System.out.println("Исходный список: " + sourceList);
        System.out.println("Отсортированный список: " + finalList);
    }

    public static void printResultToFile(List<Box> finalList) throws IOException {
        FileWriter fileWriter= new FileWriter(new File("src/com/company/Tests/output.txt"));
        fileWriter.append((String.valueOf(finalList)));
        fileWriter.close();
    }

    public static List<Box> readBoxes(Scanner scanner, List<Box> list) {
        while (scanner.hasNextInt()) {
            list.add(new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        return list;
    }

    public static List<Box> getSourceListForOutputOnConsole(List<Box> list) {
        List<Box> sourceList = new ArrayList<>();
        sourceList.addAll(list);
        return sourceList;
    }
}