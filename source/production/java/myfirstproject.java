//you have to import for Scanner
import java.util.InputMismatchException;
import java.util.Scanner;

public class myfirstproject {
    public static void main(String[] args) {
        boolean time = true;
        int hours = 0, minutes = 0, tMin, hoursAlarm, minAlarm; //tMin is total minutes

        do {
            try {
                time = true;
                Scanner input = new Scanner(System.in); // we use scanner because of input
                System.out.println("When would you like to wake up, Steve? do not forget to enter hours and mins!");
                hours = input.nextInt();
                minutes = input.nextInt();

                if (hours < 0 || hours > 23) {
                    time = false;
                    System.out.println("please enter a correct form for hours, Steve! Like 7");
                } //we use 24 hours rotation so hours can not be bigger than 23 or less than 0
                if (minutes < 0 || minutes > 59) {
                    time = false;
                    System.out.println("please enter a correct form for minutes, Steve! Like 43");
                } //minutes can not be bigger than 60 or less than 0
            } catch (InputMismatchException e) {
                System.out.println("please enter a correct form, Steve! Like 23 49");
                time = false;
                //it has to be positve integer, it can be float, negative etc.
            }
        } while(!time);
        tMin = (((hours * 60 )+ minutes ) - 45 ); // we have to substract 45 mins because project ask like this  His friend Justin offered this simple solution: set his alarm clock 45 minutes early, and he can enjoy the comfort of his bed, fully awake, for 45 minutes each day.

        hoursAlarm = (tMin/ 60);
        minAlarm = (tMin % 60);

        System.out.println("Hey Steve, alarm set ");
        System.out.println(hoursAlarm < 10 ? "0" + hoursAlarm + " ": hoursAlarm +" ");
        System.out.println(minAlarm < 10 ? "0"+ minAlarm : minAlarm);
    }

    }

