package org.example.files;

import java.io.*;
import java.util.Arrays;
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
        StringBuilder builder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            builder.append(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}
