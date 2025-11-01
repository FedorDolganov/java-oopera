package ru.fedor.fproj.Shows;

import ru.fedor.fproj.Humans.Actor;
import ru.fedor.fproj.Humans.Director;
import ru.fedor.fproj.Humans.Person;

import java.util.ArrayList;

public class MusicalShow extends Show{

    protected Person musicAuthor;
    protected String librettoText;


    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public void printLiberttoText(){
        System.out.println("Текст либертто спектакля «" + title + "»");
        System.out.println(librettoText);
        System.out.println();
    }

}
