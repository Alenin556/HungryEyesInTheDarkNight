package Actions;

import Data.Clothes;
import Data.HowToGo;
import Data.HunterWeapon;

import java.util.Scanner;

public class FightOnRoad {

    public static void fightOnRoad() {
        Scanner sc = new Scanner(System.in);
        HunterWeapon hunterWeapon = new HunterWeapon();
        Clothes clothes = new Clothes();
        Health health = new Health();
        HowToGo howToGo = new HowToGo();

        if (howToGo.getWalk() == 1 && (!(howToGo.getOnHorse() == 1))) {
            System.out.println(" ");
            System.out.println("Отправившись в путь пешком, и пройдя половину пути, из леса к вам выходят трое людей с топорами и в рваной одежде.");
            System.out.println("Люди из леса : Доброй ночи охотник, если хочешь жить, отдай нам свое оружие, одежду, и все что у тебя есть и мы не убьем тебя.");
            System.out.println(" Что вы выберете?");
            int tries = 1;
            for (int x = 0; x < tries; x++) {
                System.out.println("1 - Разрубить людей из леса.");
                System.out.println("2 - Отдать оружие и одежду.");
                System.out.println("3 - Убежать.");
                int fightChoice1 = sc.nextInt();
                switch (fightChoice1) {
                    case 1:
                        if (HunterWeapon.getFatherWeapon() == 1) {
                            System.out.println("Вы делаете тяжелый взмах мечом вашего отца, перед тем как нанести удар, один из разбойников успевает уколоть вас в плечо.");
                            System.out.println("Здоровье: " + clothes.getHealth() + " - 1" );
                            clothes.setHealth(Clothes.getHealth() - 1);
                            System.out.println("Одним ударом вам удается разрубить двух людей одновременно.");
                            System.out.println("Третий, наблюдая за тем как его братья лежат разрубленными на земле, просит пощадить его и убегает в лес.");
                            health.healthInfo();

                        }
                        if (HunterWeapon.getGrandFatherWeapon() == 1) {
                            System.out.println("Вы делаете выпад на одного из людей насаживая его на копье вашего прадеда, после того как с одним из них было покончено, двое других наносят вам два удара");
                            System.out.println("Один удар приходится по спине, другой по левой руке");
                            System.out.println("Здоровье: " + clothes.getHealth() + " - 2" );
                            clothes.setHealth(clothes.getHealth() - 2);
                            System.out.println("Сделав рывок в сторону, вы принимаете решение сделать удар с разворотом и убить сразу двоих.");
                            System.out.println("После чего сделав рывок в сторону врагов, вы сносите наконечником копья две головы разом.");
                            health.healthInfo();
                        }
                        if (HunterWeapon.getYourWeapon() == 1) {
                            System.out.println("Вы неспешно достаете свой меч из ножен, даете тем самым всем троим приблизиться к вам как можно ближе, и после того как один из них уже находился в метре от вас, вы делаете рывок как бы сквозь всех троих.");
                            System.out.println("....");
                            System.out.println("Наступила коротка тишина, и было только слышно как дует ветер, и ветви раскачивающиеся на ветру.");
                            System.out.println("....");
                            System.out.println("Все три головы теперь лежали на земле, на одной из них еще моргали глаза, как будто не успев осознать что произошло.");
                            health.healthInfo();
                        }
                        break;
                    case 2:
                        System.out.println("Вы начинаете снимать с себя одежду, но тут кто то из разбойников уже резко оказался около вас и бьет вас по голове.");
                        System.out.println("....");
                        System.out.println("Вы приходите в себя через короткое время,но уже ни разбойников, ни оружия, ни сумки и ни одежды, ничего не осталось. А вокруг вас ночь и тьма...");
                        System.out.println("Приключение окончено.");
                        return;
                    case 3:
                        System.out.println("Приняв решение бежать, вы ловко обходите моментами контратакуя атаки противников.");
                        System.out.println("Почти избежав столкновения вы бежите ,но третий разбойник придя в себя отправляет в до гонку вам стрелу.");
                        System.out.println("Стрела попадает прямо в ногу, от чего вы вскрикивая падаете, но вовремя извлекаете стрелу из бедра и продолжаете бегство.");
                        System.out.println("Здоровье: " + clothes.getHealth() + " - 3" );
                        clothes.setHealth(clothes.getHealth() - 3);
                        health.healthInfo();
                }
            }
        }
        if (howToGo.getOnHorse() == 1 && (!(howToGo.getWalk() == 1))) {
            System.out.println(" ");
            System.out.println("Отправившись в путь лошади, и проехав половину пути, из леса к вам выходят трое людей с топорами и в рваной одежде.");
            System.out.println("Люди из леса : Доброй ночи охотник, если хочешь жить, отдай нам свое оружие, одежду, и лошадь, и мы не убьем тебя.");
            System.out.println(" Что вы выберете?");
            int tries = 1;
            for (int x = 0; x < tries; x++) {
                System.out.println("1 - Разрубить людей из леса.");
                System.out.println("2 - Отдать оружие, одежду и лошадь.");
                System.out.println("3 - Ускакать на лошади.");
                int fightChoice1 = sc.nextInt();
                switch (fightChoice1) {
                    case 1:
                        if (HunterWeapon.getFatherWeapon() == 1) {
                            System.out.println("Спешившись с лошади");
                            System.out.println("Вы делаете тяжелый взмах мечом вашего отца, перед тем как нанести удар, один из разбойников успевает уколоть вас в плечо.");
                            System.out.println("Здоровье: " + clothes.getHealth() + " - 1" );
                            clothes.setHealth(Clothes.getHealth() - 1);
                            System.out.println("Одним ударом вам удается разрубить двух людей одновременно.");
                            System.out.println("Третий, наблюдая за тем как его братья лежат разрубленными на земле, просит пощадить его и убегает в лес.");
                            health.healthInfo();

                        }
                        if (HunterWeapon.getGrandFatherWeapon() == 1) {
                            System.out.println("Спешившись с лошади");
                            System.out.println("Вы делаете выпад на одного из людей насаживая его на копье вашего прадеда, после того как с одним из них было покончено, двое других наносят вам два удара");
                            System.out.println("Один удар приходится по спине, другой по левой руке");
                            System.out.println("Здоровье: " + clothes.getHealth() + " - 2" );
                            clothes.setHealth(clothes.getHealth() - 2);
                            System.out.println("Сделав рывок в сторону, вы принимаете решение сделать удар с разворотом и убить сразу двоих.");
                            System.out.println("После чего сделав рывок в сторону врагов, вы сносите наконечником копья две головы разом.");
                            health.healthInfo();
                        }
                        if (HunterWeapon.getYourWeapon() == 1) {
                            System.out.println("Спешившись с лошади");
                            System.out.println("Вы неспешно достаете свой меч из ножен, дав тем самым всем троим приблизиться к вам как можно ближе, и после того как один из них уже находился в метре от вас, вы делаете рывок как бы сквозь всех троих.");
                            System.out.println("...");
                            System.out.println("Наступила коротка тишина, и было слышно только как дует ветер, и ветви раскачивающиеся на ветру.");
                            System.out.println("...");
                            System.out.println("Все три головы теперь лежали на земле, на одной из них еще моргали глаза, как будто не успев осознать что произошло.");
                            health.healthInfo();
                        }
                        break;
                    case 2:
                        System.out.println("Вы начинаете снимать с себя одежду, но тут кто то из разбойников уже резко оказался около вас и бьет вас по голове.");
                        System.out.println("....");
                        System.out.println("Вы приходите в себя через короткое время, но уже ни лошади, ни одежды, ничего не осталось. А вокруг вас ночь и тьма...");
                        System.out.println("Приключение окончено.");
                        return;
                    case 3:
                        System.out.println("Приняв решение бежать, вы проскакиваете между разбойниками, опрокинув их на землю.");
                        System.out.println("Почти избежав столкновения вы скачите по дороге ,но третий разбойник придя в себя отправляет в до гонку вам стрелу.");
                        System.out.println("Стрела попадает глубоко в живот лошади, от чего она вскрикивает, но продолжает бег.");
                        health.healthInfo();
                }
            }
        }
    }
}
