package org.example.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Directory {

    public Directory() {
    }

    // Excercise 1

    public void printDirectory(String directoryPath) {

        File[] fileList = new File(directoryPath).listFiles();
        System.out.println(Arrays.toString(fileList));
    }

    // Excercise 2
    public boolean createNewFile() {
        Scanner s = new Scanner(System.in);
        System.out.print("File name: ");
        String filename = s.nextLine();
        System.out.println("File type (txt, json, xml, yml or whatever): ");
        String fileType = s.nextLine();
        try {
            File file = new File("src/main/resources/" + filename + "." + fileType);
            if (file.createNewFile()) {
                writeToFile(file.getPath(), file);
                System.out.println("File created: " + file.getName());
                return true;
            } else {
                System.out.println("File: " + file.getAbsoluteFile() + " already exists!");
                return false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
            text = bufferedReader.readLine();
            while (text != null) {
                builder.append(bufferedReader.readLine());
                text = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return builder.toString();
    }
    public boolean areTextFilesEqual(File file1, File file2) {
        return file1.equals(file2);
    }

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
            textBuilder.append(bufferedReader.readLine());
            bufferedReader.close();
            String textBeforeInvering = textBuilder.toString();
            for (String word : textBeforeInvering.split(" ")) {
                stringListBeforeInverting.add(word);
            }
            for (int i = stringListBeforeInverting.size(); i >= 0; i--) {
                invertedTextBuilder.append(stringListAfterInverting);

            }
            System.out.println(invertedTextBuilder.toString());
            return true;


        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
