package ru.fedor.fproj.Shows;

import ru.fedor.fproj.Humans.Actor;
import ru.fedor.fproj.Humans.Director;

import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void printListOfActors(){
        System.out.println("Список актёров спектакля «" + title + "»");
        for (Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
        System.out.println();
    }

    public void addNewActor(Actor newActor){
        for (int i = 0;i < listOfActors.size();i++){
            if (listOfActors.get(i).equals(newActor)){
                System.out.println("Этот актёр уже играет в этом спектакле");
                System.out.println();
                return;
            }
        }

        listOfActors.add(newActor);
        System.out.println("Новый актёр успешно добавлен!");
        System.out.println();
    }

    public void replaceActor(Actor newActor, String surname){
        for (int i = 0;i < listOfActors.size();i++){
            if (listOfActors.get(i).getSurname().equals(surname)){
                listOfActors.set(i, newActor);
                System.out.println("Актёр успешно заменён!");
                System.out.println();
                return;
            }
        }

        System.out.println("Актёра с фамилией " + surname + " не найден!");
        System.out.println();
    }

}
