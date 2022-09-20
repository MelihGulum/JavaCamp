
public class miniProject5 {

    public static void main(String[] args) {

        int[] numbers = new int[] {1,2,5,7,9,0};
        int toBeSought = 6;

        boolean isIn = false;
        for(int number: numbers){
            if(number==toBeSought){
                isIn = true;
                break;

            }
        }
        if(isIn){
            System.out.println("We have the number");
        }
        else {
            System.out.println("We do NOT have the number");
        }
    }
}