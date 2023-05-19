package Actions;

import Data.Clothes;
import Data.HowToGo;
import Data.HunterWeapon;
import Data.MonstersAndArtifacts;

import java.util.Scanner;

public class MeetingWithLeshii {


    static Scanner sc = new Scanner(System.in);
    static MonstersAndArtifacts monstersAndArtifacts = new MonstersAndArtifacts();
    HunterWeapon hunterWeapon = new HunterWeapon();
    static Clothes clothes = new Clothes();
    static Health health = new Health();
    HowToGo howToGo = new HowToGo();

    public static void meetingWithLeshii() {

        System.out.println("Пробираясь в ночи, через чащу леса вам всюду навстречу попадаются следы когтей на деревьях, порой бывает, что на местах где оставлены следы от когтей, под деревьями лежат чьи то останки в крови.");
        System.out.println("Пройдя в ночи по лесу несколько километров, вы натыкаетесь на огромное дерево.");
        System.out.println("Обойдя вокруг него вы понимаете что дерево возможно магическое, так как на нем есть метки древних рун, которые играют и переливаются в ночи сиреневым цветом.");
        System.out.println("Вдруг, неожиданно вы начинает слышать голос : Добрый ночи странник.");
        System.out.println("Осознав что с вами говорит дерево вы отступаете на какое то расстояние от него.");
        System.out.println("Дерево : Реши загадку странник, и я позволю тебе пройти туда, куда твой путь лежит.");
        System.out.println("Загадка: На горе шумит, а под горой молчит. Что это?");
        System.out.println("Примите правильное решение:");
        int tries = 1;
        for (int x = 0; x < tries; x++) {
            System.out.println("1 - Лес.");
            System.out.println("2 - Зверь.");
            System.out.println("3 - Вы решаете убежать и не отвечать.");
        }

        int answerChoice1 = sc.nextInt();
        switch (answerChoice1) {
            case 1:
                System.out.println("Ответ верный. Но у меня есть еще одна загадка.");
                System.out.println(" ");
                System.out.println("Загадка: Кто больше всех в лесу за порядком следит, врагов не пускает и своих защищает?");
                System.out.println("1 - Оборотень.");
                System.out.println("2 - Леший.");
                int answerChoice2 = sc.nextInt();
                switch (answerChoice2) {
                    case 1:
                        System.out.println("Ответ неверный.");
                        System.out.println("Земля под вами начинает дрожать, вы начинаете терять равновесие и падает на спину.");
                        System.out.println("Вдруг вы слышите шелест листьев за спиной.");
                        System.out.println("Не успев встать для принятия оборонительной стойки, вы попадаете в лапы Лешего, хозяина и охранника всего живого в этом лесу.");
                        if (monstersAndArtifacts.getWeaponForLeshy() == 1) {
                            System.out.println("Вы достаете из сумки, розу из сада Милисы и Леший распадается на мелки листья березы");
                        } else {
                            System.out.println("Вам не удается выбраться из лап Лешего. Леший превращает вас еще в одно одиноко стоявшее дерево которое находится в его владениях.");
                            System.out.println("Приключение окончено. Вы умерли.");
                        }
                        break;
                    case 2:
                        System.out.println("из за дерева выглядывает существо ростом со взрослый дуб, глаза его огромны и горят желтым притухшим светом.");
                        System.out.println("Ответ верный, отвечает дерево.");
                        System.out.println("Леший делает взмах руками, и вам подсвечивается дорога из светлячков.");
                        System.out.println("Леший сообщает вам что светлячки подсветят вам дорогу к тому месту о котором вы сможете подумать.");
                        System.out.println("Вы продолжаете свой путь.");
                        break;
                }
                break;
            case 2:
                System.out.println("Ответ неверный.");
                System.out.println("Земля под вами начинает дрожать, вы начинаете терять равновесие и падает на спину.");
                System.out.println("Вдруг вы слышите шелест листьев за спиной.");
                System.out.println("Не успев встать для принятия оборонительной стойки, вы попадаете в лапы Лешего, хозяина и охранника всего живого в этом лесу.");
                if (monstersAndArtifacts.getWeaponForLeshy() == 1) {
                    System.out.println("Вы достаете из сумки, розу из сада Милисы и Леший распадается на мелки листья березы");
                } else {
                    System.out.println("Вам не удается выбраться из лап Лешего. Леший превращает вас еще в одно одиноко стоявшее дерево которое находится в его владениях.");
                    System.out.println("Приключение окончено. Вы умерли.");
                }
                break;
            case 3:
                System.out.println("Решив убежать, вы устремляетесь в лес, пробежав какое то расстояние, вы останавливаетесь чтобы перевести дух и восстановить дыхание.");
                System.out.println("Но скрыться в лесу от того кто здесь следит за порядком у вас не получается.");
                if (monstersAndArtifacts.getWeaponForLeshy() == 1) {
                    System.out.println("Вы достаете из сумки, розу из сада Милисы и Леший распадается на мелки листья березы");
                } else {
                    System.out.println("Вы чувствуете как что то пронзает ваши руки. Осмотрев их, вы отмечаете что они проткнуты острыми, толстыми ветками.");
                    System.out.println("Вскоре все ваше тело пронзают десятки острых веток.");
                    System.out.println("Приключение окончено. Вы умерли.");
                    break;
                }


        }
    }
}