import Actions.FightOnRoad;
import Data.*;

import java.util.Scanner;

public class HungryEyesInTheDarkNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
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
        System.out.println("В деревне уже почти не осталось людей способных справится с ним, а все те кто хотел это сделать так и не вернулись...");
        System.out.println(" ");
        System.out.println("По тому, что видели и слышали жители, теперь вы знаете что: ");
        System.out.println("Раз в две недели существо выходит из леса и добирается до деревни, если оно было голодное. На утро мог пропасть чей то ребенок или чей то член семьи,");
        System.out.println("а во дворе на главной улице могли остаться их останки с костями лежащие в алой луже крови.");
        System.out.println("Если существо было сытое, то оно не выходило. Но всю ночь был слышан дикий волчий вой.");
        System.out.println(" ");
        System.out.println("Вам когда то уже приходилось встречаться с Лешим в этих краях, но всего скорее вы думаете что это не его рук дела.");
        System.out.println(" ");
        System.out.println("Зайдя в таверну, чтобы перевести дух и выпить, усевшись за стол и заказав выпить у хозяйки таверны, вы слышите как за соседнем столом переговариваются мужики -");
        System.out.println(" М : Вы видели что творится ночью в темном лесу ? ");
        System.out.println("ДМ : А что там ?");
        System.out.println(" М : Вчера вечером из деревни я видел как там будто кто то колдует, потому как лес загорался разными красками в ночи, то зелеными , то желтыми ,иногда и фиолетовым.");
        System.out.println(" Вы начинаете подозревать что рядом с деревней затаилось не одно существо с которым вам возможно придется встретится.");
        System.out.println(" ");
        System.out.println("Выходя из таверны к вам навстречу шел фермер, от которого вы узнали что -");
        System.out.println("Однажды, возможно около недели назад, после очередного ночного нашествия существа на деревню, фермер заметил что существо уходя в лес начало принимать человечий облик.");
        System.out.println(" ");
        System.out.println("По пути к своей хижине, вы узнали кое-что еще, от одной девушки которую вы встретили на центральной улице - ");
        System.out.println("Приближаясь к дому в один день девушка заметила человека прячущегося за деревьями в лесу, без одежды, заметив её он убежал в гущу леса.");
        System.out.println(" ");
        System.out.println("Подходя к своей хижине, вы видите что у порога вас ждет пара девиц. Подойдя ближе вы интересуетесь в чем же дело.");
        System.out.println("Они рассказывают вам о том что, вчера ночью их друга кто укусил в шею, на месте укуса были оставлены 4 глубокие раны от чьих то зубов. А сегодня, его уже не было видно в деревне.");
        System.out.println(" ");
        System.out.println("Узнав достаточно обо всем что творится в деревне, вы собираетесь положить всему этому конец");
        System.out.println(" ");
        MonstersAndArtifacts monsters = new MonstersAndArtifacts();
        monsters.guessTheMonsters();
        System.out.println(" ");
        System.out.println("Помните, что каждый артефакт может пригодится вам в бою.");
        System.out.println(" ");
        System.out.println("Выбрав из артефактов то что вам пригодится на охоте, вы подходите к стене на которой висит ваше оружие, и оружие ваших предков-охотников.");
        HunterWeapon weapon = new HunterWeapon();
        weapon.chooseWeapon();
        System.out.println(" ");
        System.out.println("После того как вы определились с оружием, последние что необходимо сделать перед отправкой на охоту, это выбрать какую одежду вы оденете этой ночью.");
        Clothes clothes =new Clothes();
        clothes.chooseClothes();
        System.out.println(" ");
        System.out.println("Завершив все необходимые приготовления и помолившись перед иконой, вы выходите из дома.");
        System.out.println(" ");
        System.out.println("Выйдя на улицу вы замечаете что погода ухудшается и уже близиться ночь. Дует ветер, люди начинают расходится по домам, в чьих то окнах уже начинают загораться первые свечи.");
        System.out.println("" );
        System.out.println("Вам нужно добраться до темного леса, чаще всего именно от туда ночью слышится вой. Лес находится в нескольких километрах от деревни.");
        HowToGo howToGo = new HowToGo();
        howToGo.chooseHowToGo();
        System.out.println("");
        FightOnRoad fightOnRoad = new FightOnRoad();
        fightOnRoad.fightOnRoad();
        System.out.println("Продолжение следует...");



    }
}
