package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        getWordCount("test.txt");
    }

    public static void getWordCount(String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        int gaps = 0;

        String text = "";
        while (scanner.hasNextLine()) {
            text = scanner.nextLine();
        }

            System.out.println("Количество символов = " + text.length());
            System.out.println("Количество символов без пробелов = " + text.replaceAll(" ", "").length());
            System.out.println("Количество слов = " + text.split(" ").length);
        }
    }
