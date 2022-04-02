package staff.repo;

import staff.Model.Person;

/**
 * Реализация Buildet для класса Person
 *
 * @author AAM
 */
public class PersonBuilder {

    private String firstName;
    private String middleName;
    private String lastName;
    private String position;

    public staff.repo.PersonBuilder setFirstName(String fullName) {
        this.firstName = firstName;
        return this;
    }

    public staff.repo.PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public staff.repo.PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public staff.repo.PersonBuilder setPosition(String position) {
        this.position = position;
        return this;
    }


    public Person createPerson() {
        return new Person(firstName, middleName, lastName, position);
    }
}
