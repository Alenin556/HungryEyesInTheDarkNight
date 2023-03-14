package Actions;

import Data.Clothes;

public class Health {
    public static void healthInfo() {

        Clothes clothes = new Clothes();
        if (clothes.getHealth() == 0) {
            System.out.println("У вас :" + " " + clothes.getHealth() + " жизней.");
        }
        if (clothes.getHealth() == 1) {
            System.out.println("У вас :" + " " + clothes.getHealth() + " жизнь.");
        }
        if ((clothes.getHealth() >= 2) && (clothes.getHealth() <= 4)) {
            System.out.println("У вас :" + " " + clothes.getHealth() + " жизни.");
        }
        if ((clothes.getHealth() <= 10) && (clothes.getHealth() >= 5)) {
            System.out.println("У вас :" + " " + clothes.getHealth() + " жизней.");
        }

    }
}
