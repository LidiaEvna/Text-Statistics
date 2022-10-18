package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        getWordCount("test.txt");
    }
    public static void getWordCount(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int characters = 0;
        int words = 0;
        int gaps = 0;

        while (scanner.hasNextLine()) {
            characters++;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
        }
            System.out.println("Количество символов = " + characters);
            System.out.println("Количество символов без пробелов = " + gaps);
            System.out.println("Количество слов = " + words);
    }
}