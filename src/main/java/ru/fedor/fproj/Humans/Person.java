package ru.fedor.fproj.Humans;

public class Person {

    protected String name;
    protected String surname;
    protected ActorGender gender;


    public Person(String name, String surname, ActorGender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
}
