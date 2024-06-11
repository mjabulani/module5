package org.example.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Directory {

    // Excercise 1

    public void printDirectory(String directoryPath) {

        File file = new File(directoryPath);
        if (file.isDirectory()) {
            File[] filesList = new File(directoryPath).listFiles();
        } else {
            System.out.println(directoryPath + " is not a directory!");
        }
    }

    // Excercise 2
    public boolean createFile() {
        Scanner s = new Scanner(System.in);
        System.out.print("File name: ");
        String filename = s.nextLine();
        System.out.println("File type (txt, json, xml, yml or whatever): ");
        String fileType = s.nextLine();
        System.out.println("Type text:");
        String textToSave = s.nextLine();

        File file = new File("src/main/resources/" + filename + "." + fileType);

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(textToSave);
                bufferedWriter.flush();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return false;
    }

    public void writeToFile(String path, File file) {
        try {
            Scanner s = new Scanner(System.in);
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            System.out.println("Provide text: ");
            String textToSave = s.nextLine();
            bufferedWriter.write(textToSave);
            bufferedWriter.flush();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(String fileName) {
        String text;
        StringBuilder builder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                builder.append(bufferedReader.readLine());
                bufferedReader.close();
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    // Excercise 5
    public boolean areTextFilesEqual(File file1, File file2) {
        return file1.equals(file2);
    }


    // Excercise 6
    public boolean invertFile(File file) {
        String text;
        String textInverted;
        StringBuilder textBuilder = new StringBuilder();
        StringBuilder invertedTextBuilder = new StringBuilder();
        List<String> stringListBeforeInverting = new ArrayList<>();
        List<String> stringListAfterInverting = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
            bufferedReader.close();
            for (String word : text.split(" ")) {
                stringListBeforeInverting.add(word);
            }
            for (int i = stringListBeforeInverting.size() - 1; i >= 0; i--) {
                invertedTextBuilder.append(stringListBeforeInverting.get(i) + " ");
            }
            FileWriter fileWriter = new FileWriter(file.getPath() + "_inv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(invertedTextBuilder));
            bufferedWriter.flush();
            return true;

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
