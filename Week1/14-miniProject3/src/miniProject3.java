
public class miniProject3 {

    public static void main(String[] args) {
        //6---> 1,2,3
        //28--> 1,2,4,7,14
        int number = 30;
        int totall = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                totall = totall + i;
            }
        }
        if (number == totall) {
            System.out.println(number + " Perfect Number.");
        } else {
            System.out.println(number + " Number is not perfect");
        }

    }
}