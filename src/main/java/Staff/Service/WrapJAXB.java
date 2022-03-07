package Staff.Service;

import Staff.Person;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/*Класс для маршалинга объекта Person
 * @return employees
 *
 * @author AAM
 * */
@XmlRootElement(name = "Employees")
public class WrapJAXB {

    @XmlElement(name = "Person")
    private static ArrayList<Person> employees = new ArrayList<Person>();

    public static ArrayList<Person> getEmployees() {
        return employees;
    }
}

