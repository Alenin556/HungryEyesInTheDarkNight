package Data;

import java.util.Scanner;

public class CreateTheName {

    static String name;

    public String getName() {
        return name;
    }

    public static void setName(String newName) {
        name = newName ;
    }

    public static void createTheName() {
        String[] wordListOne = {"Беспощадный", "Кровожадный", "Безжалостный", "Непобежденный", "Потрясающий", "Невероятный", "Доблестный"};
        String[] wordListTwo = {"истребитель нечисти", "охотник за головами", "разгоняющий тьму"};
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);

        String yourName = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + name;

       setName(yourName);

    }
    public static void main(String[] args) {


    }
}
