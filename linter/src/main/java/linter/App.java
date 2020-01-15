package linter;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {

    // Method (main) to easily find initial gates.js bugs
    public static void main(String[] args) {

        App gatesBugDetect = new App();
        String gatesErrors = gatesBugDetect.bugVac(Paths.get("src/main/resources/gates.js"));
        System.out.println(gatesErrors);

    }

    // Method that takes in a file path to scan for errors
    public String bugVac(Path pathName) {

        // Start with empty string
        String errorDisplayMessage = "";

        // Try/Catch cause hey, ya never know
        try {
            // Line being scanned
            int curr = 1;

            // Scanner creation
            Scanner bugDetect = new Scanner(new File(pathName.toUri()));

            while (bugDetect.hasNext()) {

                // Create next line that will be processed as a String
                String nextLine = bugDetect.nextLine();

                // Error check
                if (thisLineIsProbablyWrong(nextLine)) {
                    errorDisplayMessage += String.format("Line %d: Missing semicolon. ", curr);
                }

                curr++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return errorDisplayMessage;

    }

    // Method for reviewing each individual line of code
    public boolean thisLineIsProbablyWrong(String codeLine) {

        boolean redFlag = true;

        // If line has no contents, no error will throw
        if (codeLine.isEmpty()) {
            redFlag = false;
        }

        // If line has contents, check for the following parameters
        if (!codeLine.isEmpty()) {

            if (codeLine.endsWith(";")) {
                redFlag = false;
            }

            if (codeLine.endsWith("{")) {
                redFlag = false;
            }

            if (codeLine.endsWith("}")) {
                redFlag = false;
            }

            if (codeLine.startsWith("//")) {
                redFlag = false;
            }

            if (codeLine.contains("if")) {
                redFlag = false;
            }

            if (codeLine.contains("else")) {
                redFlag = false;
            }
        }

        return redFlag;

    }
}


