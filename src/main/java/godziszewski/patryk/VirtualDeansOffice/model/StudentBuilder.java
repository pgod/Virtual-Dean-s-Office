package godziszewski.patryk.VirtualDeansOffice.model;

/**
 * Created by Patryk on 2016-12-20.
 */
public class StudentBuilder {
    String name;
    String surname;
    String username;
    String password;
    public static StudentBuilder createStudent() {
        return new StudentBuilder();
    }
    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public StudentBuilder withUsername(String username) {
        this.username = username;
        return this;
    }
    public StudentBuilder withPassword(String password) {
        this.password = password;
        return this;
    }
    public Student build() {
        if(this.name == null) throw new NullPointerException("name");
        if(this.surname == null) throw new NullPointerException("surname");
        if(this.username == null) throw new NullPointerException("username");
        if(this.password == null) throw new NullPointerException("password");
        return new Student(this);
    }
}
