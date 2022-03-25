package Staff.Service;

import Staff.Person;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
/**
 * Класс для маршалинга объекта Person
 *
 * @author AAM
 **/
@XmlRootElement(name = "personsWrapper")
public class PersonListHolder {

    private ArrayList<Person> persons = new ArrayList<>();

    @XmlElementWrapper(name = "persons")
    @XmlElement(name = "person")
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}