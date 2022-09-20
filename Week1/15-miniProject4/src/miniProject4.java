
public class miniProject4 {

    public static void main(String[] args) {
        //220-284
        int number1 = 615;
        int number2 = 58;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<number1;i++){
            if(number1 % i == 0){
                sum1=sum1+i;
            }
        }
        for(int i=1;i<number2;i++){
            if(number1 % i == 0){
                sum2=sum2+i;
            }
        }
        if(number1==sum2 && number2==sum1){
        System.out.println("Bu iki sayı arkadaşdır.");
        } else {
            System.out.println(number1+ " ve "+number2+" sayilari arkadaş değildir.");
        }


    }
}