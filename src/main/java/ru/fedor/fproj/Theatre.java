package ru.fedor.fproj;

import ru.fedor.fproj.Humans.Actor;
import ru.fedor.fproj.Humans.ActorGender;
import ru.fedor.fproj.Humans.Director;
import ru.fedor.fproj.Humans.Person;
import ru.fedor.fproj.Shows.Ballet;
import ru.fedor.fproj.Shows.Opera;
import ru.fedor.fproj.Shows.Show;

import java.util.ArrayList;
import java.util.Arrays;

public class Theatre {

    protected static final String BALLET_TEXT = "Мне говорят, что я - балбес.\nЧто я вчера с берёзы слез.\nНе человек, а динамит,\nИ подо мной земля горит.\nИ, в общем, правду говорят....\nНо в этом я не виноват.\nА виноват то в этом тот…\nКто у меня внутри живё-ё-ёт!!!\nОн у меня внутри живёт,\nОн мне покоя не дает.\nОн удивительный хитрец,\nОн баламут и обормо-о-от!";

    public static void main(String[] args) {
        Actor actor1 = new Actor("Джейкоб", "Рэдклифф", ActorGender.MALE, 165.0);
        Actor actor2 = new Actor("Вильгекльм", "Ди Каприо", ActorGender.MALE, 183.0);
        Actor actor3 = new Actor("Брээдли","Питт", ActorGender.MALE, 180.0);

        Director director1 = new Director("Иван", "Иванович", ActorGender.MALE, 26);
        Director director2 = new Director("Екатерина", "Мылова", ActorGender.FEMALE, 14);

        Person musicAuthor = new Person("Сергей", "Прокофьев", ActorGender.MALE);

        Person choreographer = new Person("Хан","Сародж", ActorGender.FEMALE);

        Show defaultShow = new Show("Ромео и Джульетта", 113, director1, new ArrayList<>(Arrays.asList(actor1, actor2)));

        Opera opera = new Opera("Щелкунчик", 67, director2, new ArrayList<>(Arrays.asList(actor3, actor2)),
                musicAuthor, "Золотая чаша, золотая\nНаполняет ароматом чая\nДом, в котором счастье обитает\nЗолотая чаша, золотая", 24);

        Ballet ballet = new Ballet("Лебединое озеро", 83, director1, new ArrayList<>(Arrays.asList(actor1, actor3)),
                musicAuthor, BALLET_TEXT, choreographer);


        defaultShow.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();


        defaultShow.replaceActor(actor3, "Рэдклифф");
        defaultShow.printListOfActors();


        opera.replaceActor(actor1, "Неизвестный");


        opera.printLiberttoText();
        ballet.printLiberttoText();
    }

}
