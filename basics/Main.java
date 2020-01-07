import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);

    Main object = new Main();
    object.clock();

  }

  public static String pluralize (String word, int number) {
    if (number == 1) {
      return word;
    } else {
      return word + "s";
    }
  }

  public static void flipNHeads (int n) {

    int counter = 0;
    int headCounter = 0;

    while (headCounter < n) {
        counter++;
      if (Math.random() < 0.5){
        System.out.println("Tails");
      } else {
        System.out.println("Heads");
        headCounter++;
      }

    }
  System.out.println("It took " + counter + " flips to flip " + n + " heads in a row.");
  }

  private synchronized void clock() {


    while(true) {
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    System.out.println(String.format("%d:%d:%d", hour, minute, second));
    try {
        this.wait(1000);
      }
      catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}


// public class ExampleSyntax {
//   public static void main(String[] args) {
//     String greeting = "Welcome to my Java program.";
//     System.out.println(greeting);

//     int x = 7;
//     float f = 42.3f;
//     double d = 42.3;

//     // execute the function called "loopTo" and pass 10 as a parameter
//     loopTo(10);

//     int four = 4;
//     int result = multiplyByTwo(four);
//     System.out.println(four + " doubled is " + result);
//   }

//   // Functions that return nothing have a return type of "void"
//   public static void loopTo(int max) {
//     for (int i = 0; i < max; i++) {
//       System.out.println("Loop #" + i);
//     }
//   }

//   // This function has a return type of "int"
//   public static int multiplyByTwo(int n) {
//     return n * 2;
//   }
// }
