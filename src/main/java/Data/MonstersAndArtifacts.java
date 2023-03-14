package Data;

import java.util.Scanner;

public class MonstersAndArtifacts {
    String monsterName;

    static int weaponForVampire;
    static int weaponForWitch;
    static int weaponForDevil;
    static int weaponForLeshy;
    static int weaponForWerewolf;
    static int weaponForLostSouls;


    public static int getWeaponForVampire() {
        return weaponForVampire;
    }

    public static void setWeaponForVampire(int newWeaponForVampire) {
        weaponForVampire = newWeaponForVampire;
    }

    public static int getWeaponForWitch() {
        return weaponForWitch;
    }

    public static void setWeaponForWhitch(int newWeaponForWhitch) {
         weaponForWitch = newWeaponForWhitch ;
    }

    public static int getWeaponForDevil() {
        return weaponForDevil;
    }

    public static void setWeaponForDevil(int newWeaponForDevil) {
         weaponForDevil = newWeaponForDevil;
    }

    public static int getWeaponForLeshy() {
        return weaponForLeshy;
    }

    public static void setWeaponForLeshy(int newWeaponForLeshy) {
        weaponForLeshy = newWeaponForLeshy;
    }


    public static int getWeaponForWerewolf() {
        return weaponForWerewolf;
    }

    public static void setWeaponForWerewolf(int newWeaponForWerewolf) {
        weaponForWerewolf = newWeaponForWerewolf ;
    }

    public static int getWeaponForLostSouls() {
        return weaponForLostSouls;
    }

    public static void setWeaponForLostSouls(int newWeaponForLostSouls) {
        weaponForLostSouls = newWeaponForLostSouls ;
    }


    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String newMonsterName) {
        monsterName = newMonsterName;
    }

    public static void guessTheMonsters() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("По историям что вы узнали, вам необходимо определить, на кого будет вестись охота этой ночью, и с кем вы возможно столкнетесь.");
        System.out.println("После выбора, у вас появится уникальное оружие против выбранного существа.");
        int tries = 3;
        int triesInfo = 4;
        for (int x = 0; x < tries; x++) {
            triesInfo --;
            System.out.println("Вы можете выбрать : " + " " + triesInfo + " артефакта.");
            System.out.println("1 - Вампир.");
            System.out.println("2 - Ведьма.");
            System.out.println("3 - Дьявол.");
            System.out.println("4 - Леший.");
            System.out.println("5 - Оборотень.");
            System.out.println("6 - Заблудшие души.");
            int monsters = sc.nextInt();
            switch (monsters) {
                case 1:
                    setWeaponForVampire(1);
                    System.out.println("Теперь у вас есть специальное оружие против Вампира: крест церкви Грааля.");

                    break;
                case 2:
                    setWeaponForWhitch(1);
                    System.out.println("Теперь у вас есть специальное оружие против Ведьмы: амулет древних Отшельников.");
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
        System.out.println(" ");
        System.out.println("В вашем сумке есть :");
        System.out.println("Оружие против Вампира:"+ " " + getWeaponForVampire());
        System.out.println("Оружие против Ведьмы:"+ " " + getWeaponForWitch());
        System.out.println("Оружие против Дьявола:"+ " " + getWeaponForDevil());
        System.out.println("Оружие против Лешего:"+ " " + getWeaponForLeshy());
        System.out.println("Оружие против Оборотня:"+ " " + getWeaponForWerewolf());
        System.out.println("Оружие против Заблудших душ:"+ " " + getWeaponForLostSouls());
    }



       /* int tries = 3;
        int x = 0;
        int monsters = sc.nextInt();
        while ((!(monstersMass[monsters] == monstersMass[7]) || (x <= 3))) {
            x++;
            System.out.println("Вы можете выбрать от 1 до 3 существ.");
            System.out.println("1 - Вампир.");
            System.out.println("2 - Призрак.");
            System.out.println("3 - Дьявол.");
            System.out.println("4 - Леший.");
            System.out.println("5 - Оборотень.");
            System.out.println("6 - Заблудшие души.");
            System.out.println("7 - Завершить выбор оружия.");
            int monstersChoice = sc.nextInt();
            if (monstersMass[monstersChoice] == monstersMass[1]) {
                setWeaponForVampire(1);
                System.out.println("Теперь у вас есть специальное оружие против Вампира: крест церкви Грааля.");
            }else if (monstersMass[monstersChoice] == monstersMass[2]) {
                    setWeaponForGhost(1);
                    System.out.println("Теперь у вас есть специальное оружие против Призрака: амулет древних Отшельников.");
            }else if (monstersMass[monstersChoice] == monstersMass[3]) {
                    setWeaponForDevil(1);
                    System.out.println("Теперь у вас есть специальное оружие против Дьявола: молитва Святых.");
            }else if (monstersMass[monstersChoice] == monstersMass[4]) {
                    setWeaponForLeshy(1);
                    System.out.println("Теперь у вас есть специальное оружие против Лешего: роза из сада Милисы.");
            }else if (monstersMass[monstersChoice] == monstersMass[5]) {
                    setWeaponForWerewolf(1);
                    System.out.println("Теперь у вас есть специальное оружие против Оборотня: серебряный кол церкви Грааля.");
            }else if (monstersMass[monstersChoice] == monstersMass[6]) {
                    setWeaponForLostSouls(1);
                    System.out.println("Теперь у вас есть специальное оружие против Заблудших душ: слезы Девственницы.");
            }else if (monstersMass[monstersChoice] == monstersMass[7]) {

            System.out.println("Теперь у вас есть специальное оружие против Заблудших душ: слезы Девственницы.");
        }
    }

        */


    public static void main(String[] args) {

    }


}
