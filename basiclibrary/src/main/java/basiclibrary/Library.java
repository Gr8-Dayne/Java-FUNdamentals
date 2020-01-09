

package basiclibrary;


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

    public static int arrayOfArrays(int[] finalArray) {

        // I am lost on this one
        for (int i = 0; i < finalArray.length; i++) {


        }
        return 0;
    }
}


// a new array of integers starts with a value of zero for every index.
//int[] temperatures = new int[7];
//for (int i = 0; i < temperatures.length; i++) {
//    System.out.println(temperatures[i]);
//}

// a new array of strings starts with a value of null for every index.
//String[] dayNames = new String[7];
//for (int i = 0; i < dayNames.length; i++) {
//    System.out.println(dayNames[i]);
//}

// an array can be hard-coded with values initially using curly braces.
//int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

//for (int i = 0; i < months.length; i++) {
//    String message = "There are " + daysInMonth[i] + " days in " + months[i];
//    System.out.println(message);
//}
