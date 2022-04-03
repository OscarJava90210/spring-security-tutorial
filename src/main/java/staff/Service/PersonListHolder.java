package staff.Service;

import staff.Model.Person;
import java.util.ArrayList ;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Класс для маршалинга объекта Person
 *
 * @author AAM
 **/
@XmlRootElement(name="personsWrapper")
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