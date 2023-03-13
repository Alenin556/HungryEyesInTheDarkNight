package Actions;

import java.util.Scanner;

public class Monsters {
    String monsterName;

    static int weaponForVampire;
    static int weaponForGhost;
    static int weaponForDevil;
    static int weaponForLeshy;
    static int weaponForWerewolf;
    static int weaponForLostSouls;


    public int getWeaponForVampire() {
        return weaponForVampire;
    }

    public static void setWeaponForVampire(int newWeaponForVampire) {
        newWeaponForVampire = weaponForVampire;
    }
    public int getWeaponForGhost() {
        return weaponForGhost;
    }

    public static void setWeaponForGhost(int newWeaponForGhost) {
        newWeaponForGhost = weaponForVampire;
    }

    public int getWeaponForDevil() {
        return weaponForDevil;
    }

    public static void setWeaponForDevil(int newWeaponForDevil) {
        newWeaponForDevil = weaponForDevil;
    }

    public int getWeaponForLeshy() {
        return weaponForLeshy;
    }

    public static void setWeaponForLeshy(int newWeaponForLeshy) {
        newWeaponForLeshy = weaponForLeshy;
    }


    public int getWeaponForWerewolf() {
        return weaponForWerewolf;
    }

    public static void setWeaponForWerewolf(int newWeaponForWerewolf) {
        newWeaponForWerewolf = weaponForWerewolf;
    }

    public int getWeaponForLostSouls() {
        return weaponForLostSouls;
    }

    public static void setWeaponForLostSouls(int newWeaponForLostSouls) {
        newWeaponForLostSouls = weaponForLostSouls;
    }



    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String newMonsterName) {
        monsterName = newMonsterName;
    }

    public static void guessTheMonsters() {
        int[] monstersMass = {0, 1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("По историям что вы узнали вам необходимо определить на кого будет вестись охота этой ночью и с кем вы возможно столкнетесь.");
        System.out.println("Вы можете выбрать до 3 существ.");
        System.out.println("1 - Вампир.");
        System.out.println("2 - Призрак.");
        System.out.println("3 - Дьявол.");
        System.out.println("4 - Леший.");
        System.out.println("5 - Оборотень.");
        System.out.println("6 - Заблудшие души.");
        int monsters = sc.nextInt();
        int tries = 3;
        for (int x = 0 ; x < tries; x++) {
            switch (monsters) {
                case 1:
                    setWeaponForVampire(1);
                    System.out.println("Теперь у вас есть специальное оружие против Вампира: крест церкви Грааля.");
                    break;
                case 2:
                    setWeaponForGhost(1);
                    System.out.println("Теперь у вас есть специальное оружие против Призрака: амулет древних Отшельников.");
                    break;
                case 3:
                    setWeaponForDevil(1);
                    System.out.println("Теперь у вас есть специальное оружие против Дьявола: молитва Святых.");
                    break;
                case 4:
                    setWeaponForLeshy(1);
                    System.out.println("Теперь у вас есть специальное оружие против Лешего: роза из сада Милисы.");
                    break;
                case 5:
                    setWeaponForWerewolf(1);
                    System.out.println("Теперь у вас есть специальное оружие против Оборотня: серебряный кол церкви Грааля.");
                    break;
                case 6:
                    setWeaponForLostSouls(1);
                    System.out.println("Теперь у вас есть специальное оружие против Заблудших душ: слезы Девственницы.");
                    break;
            }
        }

    }

    public static void main(String[] args) {

    }


}
