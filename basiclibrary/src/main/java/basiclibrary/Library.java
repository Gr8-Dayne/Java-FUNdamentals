package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Library {

    public static int[] Roll(int specifiedRolls) {

        int[] rolls = new int[specifiedRolls];

        for (int i = 0; i < specifiedRolls; i++) {
            int rollCount = (int)(Math.random() * 6) + 1;
            rolls[i] = rollCount;
        }
        return rolls;
    }

    public static boolean ContainsDuplicates(int[] incomingArray) {

        // Nested "For loop"
        for (int i = 0; i < incomingArray.length; i++) {
            // I'm confused as to why this works (i and j relation)
            for (int j = i + 1; j < incomingArray.length; j++) {
                if (incomingArray[i] == (incomingArray[j])) {
                    // Contains duplicates
                    return true;
                }
            }
        }
        // No duplicates
        return false;
    }

    public static double AveragesAssemble(int[] averageArray){

        double arraySum = 0;

        // "ForEach"
        for( int number : averageArray){
            arraySum += number;
        }
        // Return total divided by array
        return arraySum / averageArray.length;
    }

    public int[] lowestArrayOfArrays(int[][] inputArrays) {

        int lAOAIndex = 0;
        double lowAverage = 100000000.0;

        for (int i = 0; i < inputArrays.length; i++) {

            for (int j = 0; j < inputArrays.length; j++) {

                double nextAvg = AveragesAssemble(inputArrays[j]);

                if (nextAvg < lowAverage) {
                    lowAverage = nextAvg;
                    lAOAIndex = j;
                }
            }
        }
        return inputArrays[lAOAIndex];
    }

    //
    // Lab 03 Methods below this
    //

    public static String getWeatherAnalytics(int[][] weatherArray){

        // Create high/low weather arrays
        int low = weatherArray[0][0];
        int high = weatherArray[0][0];

        // Create empty string
        HashSet<Integer> varyingTemperatures = new HashSet<>();
        StringBuilder answer = new StringBuilder();


        for (int i = 0; i < weatherArray.length; i++){

            for (int j = 0; j < weatherArray[i].length; j++){

                if (weatherArray[i][j] < low){
                    low = weatherArray[i][j];
                }

                if (weatherArray[i][j] > high){
                    high = weatherArray[i][j];
                }

                varyingTemperatures.add(weatherArray[i][j]);

            }
        }

//        System.out.println("High: " + high);
//        System.out.println("Low: " + low);

        // Build string
        for (int i = low + 1; i < high; i++){

            if (!varyingTemperatures.contains(i)){
                answer.append("Never saw: ").append(i).append(" ");
            }
        }

        return answer.toString();

    }


    public static String electionTally(List<String> votes) {

        // Create
        HashMap<String, Integer> electoralMap = new HashMap<>();

        // Start from scratch
        int votesSum = 0;
        String victor = "";

        // Iterate through votes
        for (String vote : votes){
            if (electoralMap.containsKey(vote)){
                electoralMap.put(vote, electoralMap.get(vote) + 1);
            } else {
                electoralMap.put(vote, 1);
            }
        }

        // Iterate through names (strings/keys)
        for (String key : electoralMap.keySet()) {
            if (votesSum < electoralMap.get(key)) {
                votesSum = electoralMap.get(key);
                victor = key;
            }
        }

        System.out.println(victor + " got the most votes.");
        return victor;
    }

}


