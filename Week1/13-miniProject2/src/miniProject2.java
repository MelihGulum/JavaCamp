
public class miniProject2 {

    public static void main(String[] args) {
        char letter ='A';
        if (letter=='A' || letter=='I' || letter=='O' || letter=='U'){
            System.out.println(letter+" Harfi Kalın Seslidir.");
        } else if (letter=='E' || letter=='İ' || letter=='Ö' || letter=='Ü') {
            System.out.println(letter+" Harfi İnce Seslidir.");

        }else {
            System.out.println("You entered the letter "+letter);
        }

    }
}