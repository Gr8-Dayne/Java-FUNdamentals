/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {

    public static int[] Roll(int n) {

        int[] rolls = {};
        int count = n;
        int result = (int) (Math.random() * 6) + 1;

        while (n > 0) {
            if (n > 0) {
                System.out.println(result);
                count--;
            } else {
                break;
            }
        }
        return rolls;
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
