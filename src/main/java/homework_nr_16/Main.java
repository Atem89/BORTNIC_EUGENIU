package homework_nr_16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("src/main/java/homework_nr_16/input.txt");
        Path outputFile = Path.of("src/main/java/homework_nr_16/output.txt");

        if(!(Files.exists(inputFile))){
            Files.createFile(inputFile);
        }

        if(!(Files.exists(outputFile))){
            Files.createFile(outputFile);
        } else {
            Files.writeString(outputFile, "");
        }

        String readFileInput = Files.readString(inputFile);
        String readFileOutput = Files.readString(outputFile);


        List<String> lines = Files.readAllLines(inputFile);
        testFileInput(lines);
        System.out.println("Format lines is Name, age, score: " + containsLineFormat(lines));
        System.out.println("--------------------------------------------------");

        Files.writeString(outputFile, findAverageScore(lines) + "\n", StandardOpenOption.APPEND);
        System.out.println(findAverageScore(lines));
        System.out.println("--------------------------------------------------");
        Files.writeString(outputFile, findYoungestStudent(lines) + "\n", StandardOpenOption.APPEND);
        System.out.println(findYoungestStudent(lines));
        System.out.println("--------------------------------------------------");
        Files.writeString(outputFile, findOldesStudent(lines) + "\n", StandardOpenOption.APPEND);
        System.out.println(findOldesStudent(lines));
    }

    public static void testFileInput(List<String> lines) {
        try {
            if(lines.isEmpty()){
                throw new IOException("Input file is empty, please input date");
            } else {
                System.out.println("Input file is not empty");
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static boolean containsLineFormat (List <String> lines){
        for (String line : lines) {
            String[] parts = line.split(",");
            if(parts.length == 3)
                return true;
        }
        return false;
    }

    public static String findAverageScore(List <String> lines){
        int count = 0;
        double totalScore = 0, averageScore;

        for (String line : lines) {
            String[] parts = line.split(",");
            double score = Double.parseDouble(parts[2]);
            totalScore += score;
            count++;
        }
        averageScore = totalScore / count;
        return "Средний балл всех лиц: " + averageScore;
    }

    public static String findYoungestStudent (List <String> lines){
        int minAge = Integer.MAX_VALUE;
        String nameYoungestStudent = "";
        for (String line : lines) {
            String[] parts = line.split(",");
            int ageYoungestStudent = Integer.parseInt(parts[1]);
            if (minAge > ageYoungestStudent){
                minAge = ageYoungestStudent;
                nameYoungestStudent = parts[0];
            }
        }
        return "Самый младший человек: " + nameYoungestStudent + " (возраст: " + minAge + ")";
    }

    public static String findOldesStudent (List <String> lines){
        int maxAge = Integer.MIN_VALUE;
        String nameOldesStudent = "";
        for (String line : lines) {
            String[] parts = line.split(",");
            int ageOldesStudent = Integer.parseInt(parts[1]);
            if (maxAge < ageOldesStudent){
                maxAge = ageOldesStudent;
                nameOldesStudent = parts[0];
            }
        }
        return "Самый старший человек: " + nameOldesStudent + " (возраст: " + maxAge + ")";
    }

}
