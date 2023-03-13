import Data.*;

import java.util.Scanner;

public class HungryEyesInTheDarkNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в новое приключение :");
        System.out.println(" ");
        System.out.println("************* Голодные глаза в темной ночи *************");
        System.out.println(" ");
        System.out.println("Введите ваше имя:");
        CreateTheName name = new CreateTheName();
        name.createTheName();
        System.out.println("Теперь вас будут звать:" + " " + name.getName()+", теперь вы охотник из Грааля.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Вернувшись после долгого путешествия вам сообщают что на деревню начало нападать зловещее существо." );
        System.out.println("В деревне уже почти не осталось людей способных справится с ним, а все те кто хотели это сделать так и не вернулись.");
        System.out.println("По тому что видели и слышали жители, теперь вы знаете что: ");
        System.out.println("Раз в две недели существо выходит из леса и добирается до деревни, если оно было голодное, на утро мог пропасть чей то ребенок или чей то член семьи,");
        System.out.println("а во дворе на главной улице могли остаться их останки с костями лежащие в алой луже крови.");
        System.out.println("Если существо было сытое то оно не выходило. Но всю ночь был слышан дикий волчий вой.");
        System.out.println(" ");
        System.out.println("Также вы узнали от одного фермера что -");
        System.out.println("Однажды, возможно около недели назад, после очередного ночного нашествия существа на деревню, фермер заметил что существо уходя в лес начало принимать человечий облик.");
        System.out.println("Еще вы слышали историю от одной девушки - ");
        System.out.println("Приближаясь к дому в один день она заметила человека прячущегося за деревьями в лесу, без одежды который заметив её убежал в гущу леса.");
        System.out.println(" ");
        System.out.println("Приближаясь к своей хижине вы видите что у порога вас уже ждут пара девиц. Подойдя ближе вы интересуетесь в чем же дело и для чего они ждут вас.");
        System.out.println("Затем они рассказывают вам о том что вчера ночью их друга кто укусил в шею, на месте укуса были оставлены 4 глубокие раны от чьих то зубов.");
        System.out.println(" ");
        System.out.println("Узнав достаточно обо всем что творится в деревне, вы собираетесь положить этому всему конец");
        System.out.println(" ");
        MonstersAndArtifacts monsters = new MonstersAndArtifacts();
        monsters.guessTheMonsters();
        System.out.println(" ");
        System.out.println("Каждый артефакт может пригодится вам в бою.");
        System.out.println(" ");
        System.out.println("Выбрав из артефактов то что вам пригодится на охоте вы подходите к стене на которой висит ваше оружие и оружие ваших предков-охотников.");
        HunterWeapon weapon = new HunterWeapon();
        weapon.chooseWeapon();
        System.out.println(" ");
        System.out.println("После того как вы определились с оружием последние что необходимо сделать перед отправкой на охоту, это выбрать какую одежду вы оденете этой ночью.");
        Clothes clothes =new Clothes();
        clothes.chooseClothes();
        System.out.println("Завершив все необходимые приготовления вы выходите из дома.");
        System.out.println("Выйдя на улицу вы замечаете что погода ухудшается и уже близиться ночь. Дует ветер, люди начинают расходится по домам, в чьих то окнах уже начинают загораться свечи.");
        System.out.println("" );
        System.out.println("Вам нужно добраться до темного леса, чаще всего именно от туда ночью слышится вой, лес находится в нескольких километрах от деревни.");
        HowToGo howToGo = new HowToGo();
        howToGo.chooseHowToGo();


    }
}
