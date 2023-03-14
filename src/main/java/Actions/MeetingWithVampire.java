package Actions;

import Data.Clothes;
import Data.HowToGo;
import Data.HunterWeapon;
import Data.MonstersAndArtifacts;

import java.util.Scanner;

import static Data.MonstersAndArtifacts.*;

public class MeetingWithVampire {

    static Scanner sc = new Scanner(System.in);
    static MonstersAndArtifacts monstersAndArtifacts = new MonstersAndArtifacts();
    HunterWeapon hunterWeapon = new HunterWeapon();
    static Clothes clothes = new Clothes();
    static Health health = new Health();
    HowToGo howToGo = new HowToGo();


    public static void meetingWithVampire() {
        System.out.println("Внутри леса, каждый звук и шорох заставляет вас вести себя предельно сосредоточенно и внимательно.");
        System.out.println("Достав оружие , вы думаете - что отпускать оружие из рук, не лучшее время.");
        System.out.println(" ");
        System.out.println("Пройдя еще какое то расстояние и миновав уже сотни деревьев, вы замечаете что под вашими ногами начал сгущаться туман.");
        System.out.println("...");
        System.out.println("На туман, начали слетаться летучие мыши.");
        System.out.println("Через уже мгновение стая мышей начала принимать, человеческую форму, но вдруг все исчезло, исчез и туман.");
        System.out.println("...");
        System.out.println("Наступила тишина. Вы стояли, слегка дрожа, не зная чего ожидать, но в глубине души отдавали себе отчет в том что");
        System.out.println("необходимо будет сделать в любой из ситуаций, которая могла произойти.");
        System.out.println("...");
        System.out.println("Осмотрев то место где происходило все действие, вы решаете продолжить путь в глубь леса, и только развернувшись перед вами застывает белая, зловещая, оскальная улыбка.");
        System.out.println("Зубы не похожи на звериные, больше похоже на человечьи, но клыки точно как будто какого то хищника.");
        System.out.println("Вы понимаете с чем столкнулись...перед вами самый настоящий вампир.");
        System.out.println("Сейчас он либо выпьет из вас всю вашу кровь, чем облегчит жизнь обитателям темного леса, или сделает вас рабом крови, облачив в такого же вампира как и он сам.");
        System.out.println("Примите правильное решение:");
        int tries = 1;
        for (int x = 0; x < tries; x++) {
            System.out.println("1 - Начать бой с оружием.");
            System.out.println("2 - Устранить вампира артефактом.");
            System.out.println("3 - Убежать.");
            System.out.println(" ");
            System.out.println("В вашем сумке есть :");
            System.out.println("Оружие против Вампира:"+ " " + getWeaponForVampire());
            System.out.println("Оружие против Ведьмы:"+ " " + getWeaponForWitch());
            System.out.println("Оружие против Дьявола:"+ " " + getWeaponForDevil());
            System.out.println("Оружие против Лешего:"+ " " + getWeaponForLeshy());
            System.out.println("Оружие против Оборотня:"+ " " + getWeaponForWerewolf());
            System.out.println("Оружие против Заблудших душ:"+ " " + getWeaponForLostSouls());
        }int fightChoice1 = sc.nextInt();
        switch (fightChoice1) {
            case 1:
                if (HunterWeapon.getFatherWeapon() == 1) {
                    System.out.println("Вы делаете тяжелый взмах мечом вашего отца, перед тем как нанести удар, вампир обнажив свои когти полоскает вас по лицу.");
                    System.out.println("Здоровье: " + clothes.getHealth() + " - 2");
                    clothes.setHealth(Clothes.getHealth() - 2);
                    System.out.println("Удар был хорошим, но по цели он не пришелся, после чего вы делаете второй замах, вампир ждал этого, и уже готовый наброситься для заключительного удара, он бросается и натыкается на ваш удар локтем в зубы");
                    System.out.println("Теперь уже с недостающими пары клыков на верхней челюсти вампир, сидит на коленях держась за свою челюсть, сделав заключительный замах, вы обезглавливаете вампира.");
                    System.out.println("Части его тела начинают вспыхивать огнем, а через мгновение от него остается лишь пепел, который вскоре уносит с собой ветер.");
                    health.healthInfo();
                    System.out.println(" ");
                    System.out.println("После того как вы успешно расправились с вампиром, вы продолжаете свой путь.");
                }
                if (HunterWeapon.getGrandFatherWeapon() == 1) {
                    System.out.println("Пристально смотря друг другу в глаза вы начинаете преступать с ноги на ногу, отчерчивая круг, ожидая кто сделает первый удар.");
                    System.out.println("...");
                    System.out.println("Вы делаете стремительный выпад на вампира, пытаясь воткнуть наконечник копья прямо в сердце, но вампир оказывается очень быстрым, и наконечник не достигает своей цели. ");
                    System.out.println("После чего вампир отвечает вам своим выпадом, но благодаря тому что копье умеет складываться в нож, вы откидываетесь назад принимая вампира в объятия и пронзая его насквозь золотым наконечником.");
                    System.out.println("...");
                    System.out.println("Части его тела начинают вспыхивать огнем, а через мгновение от него остается лишь пепел, который вскоре уносит с собой ветер.");
                    health.healthInfo();
                    System.out.println(" ");
                    System.out.println("После того как вы успешно расправились с вампиром, вы продолжаете свой путь.");
                }
                if (HunterWeapon.getYourWeapon() == 1) {
                    System.out.println("Всю дорогу по лесу, ваш меч не ускользал из рук, встав в стойку вы ждете пока вампир не сделает первый удар.");
                    System.out.println("Как в друг вампир начинает атаковать вас с неистовой и ужасающей злостью, бросаясь, отбегая и еще раз бросаясь на вас, вновь и вновь.");
                    System.out.println("....");
                    System.out.println("Большинство атак вам удалось парировать и контратаковать, но не все. Ваша левая рука будто бы была атакована каким то гигантским хищником.");
                    System.out.println("Все три головы теперь лежали на земле, на одной из них еще моргали глаза, как будто не успев осознать что произошло.");
                    System.out.println("Здоровье: " + clothes.getHealth() + " - 4");
                    clothes.setHealth(Clothes.getHealth() - 4);
                    System.out.println(" ");
                    System.out.println("Бросившись в последнюю атаку, надеявшись добить вас, вампир делает прыжок и оказавшись около вас, он протягивает руки чтобы сделать укус, но неожиданно теряет обе свои кисти.");
                    System.out.println("Вы всегда были уверены во владении своим мечом, и добиваете врага ударом в сердце.");
                    System.out.println("Части его тела начинают вспыхивать огнем, а через мгновение от него остается лишь пепел, который вскоре уносит с собой ветер.");
                    health.healthInfo();
                    System.out.println(" ");
                    System.out.println("После того как вы успешно расправились с вампиром, вы продолжаете свой путь.");
                }
                break;
            case 2:
                System.out.println(" ");
                if (monstersAndArtifacts.getWeaponForVampire() == 1) {
                    System.out.println("Вы достаете священный крест церкви Грааля и направляете его на вампира...");
                    System.out.println("Части тела вампира начинают вспыхивать огнем он начинает издавать мучительные крики, а через мгновение от него остается лишь пепел, который вскоре уносит с собой ветер.");
                    System.out.println(" ");
                    System.out.println("После того как вы успешно расправились с вампиром, вы продолжаете свой путь.");
                }
                // если 0 то ... можно выбрать бой или бежать.
                break;
            case 3:
                System.out.println("Приняв решение бежать, вы сталкиваете со своего пути вампира и он валиться на землю, одновременно от чего то смеясь.");
                System.out.println("...");
                System.out.println("Думая что вы избежали столкновения, вы останавливаетесь чтобы перевести дух, но вдруг ваше дыхание перехватывает резкое чувство боли и пустоты.");
                System.out.println("Перед тем как почувствовать боль, вас будто бы что то обожгло в груди...");
                System.out.println("...");
                System.out.println("Опустив глаза чтобы осмотреть грудь вы видите, бледно белую руку, которая сжимает еще бьющиеся сердце.");
                System.out.println("Приключение окончено. Вы умерли.");
        }
    }
}
