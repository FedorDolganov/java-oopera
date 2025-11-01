package ru.fedor.fproj.Humans;

import java.util.Objects;

public class Actor extends Person{

    protected double height;

    public Actor(String name, String surname, ActorGender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр " + name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return this.height == actor.height
                && this.name.equals(actor.name)
                && this.surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }
}
