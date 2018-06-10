package com.company;

import com.company.StringProcessor;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        StringProcessor stringProcessor = new StringProcessor();
        String input;

        {
            try {
                input = stringProcessor.readInputText();
                System.out.println(stringProcessor.processText(input));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

