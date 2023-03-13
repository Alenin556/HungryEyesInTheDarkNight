package Data;

import java.util.Scanner;

public class HowToGo {

    static int walk;
    static int onHorse;

    public static int getWalk() {
        return walk;
    }

    public static void setWalk(int newWalk) {
        walk = newWalk;
    }

    public static int getOnHorse() {
        return onHorse;
    }

    public static void setOnHorse(int newOnHorse) {
        onHorse = newOnHorse;
    }




    public static void chooseHowToGo() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Вы можете решить идти пешком или поехать на лошади.");

        int tries = 1;
        for (int x = 0; x < tries; x++) {
            System.out.println("1 - Пешком.");
            System.out.println("2 - На лошади.");
            int monsters = sc.nextInt();
            switch (monsters) {
                case 1:
                    setWalk(1);
                    break;
                case 2:
                    setOnHorse(1);
                    break;
            }
        }

        if (getWalk() == 1) {
            System.out.println("Вы отправились в путь пешком.");
        } else if (getOnHorse() == 1) {
            System.out.println("Вы оседлали лошадь и отправились в путь.");
        }
    }
}
