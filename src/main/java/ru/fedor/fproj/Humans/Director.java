package ru.fedor.fproj.Humans;

public class Director extends Person {

    protected int numberOfShows;


    public Director(String name, String surname, ActorGender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режисёр " + name + " " + surname;
    }
}
