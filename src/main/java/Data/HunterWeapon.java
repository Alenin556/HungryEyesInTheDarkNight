package Data;

import java.util.Scanner;

public class HunterWeapon {

    static int fatherWeapon;
    static int grandFatherWeapon;
    static int yourWeapon;

    public static int getFatherWeapon() {
        return fatherWeapon;
    }

    public static void setFatherWeapon(int newFatherWeapon) {
        fatherWeapon = newFatherWeapon;
    }

    public static int getGrandFatherWeapon() {
        return grandFatherWeapon;
    }

    public static void setGrandFatherWeapon(int newGrandFatherWeapon) {
        grandFatherWeapon = newGrandFatherWeapon;
    }

    public static int getYourWeapon() {
        return yourWeapon;
    }

    public static void setYourWeapon(int newYourWeapon) {
        yourWeapon = newYourWeapon;
    }


    public static void chooseWeapon() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("В центре стены вертикально висит крупный стальной меч вашего отца. В высоту от достигает 120 см. Рукоятка переплетена изысканной коричневой кожей. Этим мечом ваш отец когда то сразил дракона.");
        System.out.println("Над мечом вашего отца висит копье вашего прадеда. Копье средней тяжести и с золотым наконечников. На это копье было насажено больше 1000 вампиров.");
        System.out.println("Справа от меча отца, висит ваш меч. Меч легок и быстр, таким мечом можно пользоваться даже когда против вас могут быть десятки противников.");
        System.out.println(" ");
        System.out.println("Вы можете взять с собой только 1 оружие");
        int tries = 1;
        for (int x = 0; x < tries; x++) {
            System.out.println("1 - Стальной меч отца.");
            System.out.println("2 - Копье с золотым наконечником прадеда.");
            System.out.println("3 - Ваш меч.");

            int monsters = sc.nextInt();
            switch (monsters) {
                case 1:
                    setFatherWeapon(1);
                    break;
                case 2:
                    setGrandFatherWeapon(1);
                    break;
                case 3:
                    setYourWeapon(1);
                    break;
            }
        }
        if (getFatherWeapon() == 1) {
            System.out.println("Вы взяли стальной меч отца.");
        } if (getGrandFatherWeapon() == 1) {
            System.out.println("Вы взяли копье с золотым наконечником прадеда.");
        } if (getYourWeapon() == 1) {
            System.out.println("Вы взяли свой меч.");
        }


    }
}
