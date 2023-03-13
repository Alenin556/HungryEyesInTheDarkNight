package Data;

import java.util.Scanner;

public class Clothes {

    public static int getLightClothes() {
        return lightClothes;
    }

    public static void setLightClothes(int newLightClothes) {
        lightClothes = newLightClothes;
    }

    public static int getMiddleClothes() {
        return middleClothes;
    }

    public static void setMiddleClothes(int newMiddleClothes) {
        middleClothes =newMiddleClothes;
    }

    static int lightClothes;
    static int middleClothes;


    public static void chooseClothes() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Внутри вашего шкафа есть отсек в котором вы храните одежду для охоты. Убрав лишнюю полку и ненужные доски вы достаете мешок.");
        System.out.println("В нем лежит :");

        int tries = 1;
        for (int x = 0; x < tries; x++) {
            System.out.println("1 - Легкий костюм с капюшоном.");
            System.out.println("2 - Средний кожаный костюм с защитой из кольчуги на груди.");
            int monsters = sc.nextInt();
            switch (monsters) {
                case 1:
                    setLightClothes(1);
                    System.out.println("Вы одели легкий костюм с капюшоном.");
                    break;
                case 2:
                    setMiddleClothes(1);
                    System.out.println("Вы одели средний кожаный костюм.");
                    break;
            }
        }

        if (getLightClothes() == 1) {
            System.out.println("Вы одели легкий костюм с капюшоном.");
        } else if (getMiddleClothes() == 1) {
            System.out.println("Вы одели средний кожаный костюм.");
        }

        }
}

