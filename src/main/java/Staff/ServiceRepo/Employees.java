package Staff.ServiceRepo;

import Staff.Person;
import Staff.Service.ParserJAXB;
import Staff.Service.WrapJAXB;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.ArrayList;

/*Класс репозиторий для объекта Person
 *
 * @author AAM
 * */
public class Employees {
	public static ArrayList<Person> listOfEmployees = new ArrayList<Person>();
	public static void setListOfEmployees(File file, Class<?> objectClass) {
		Object list = null;
		try {
			list = ParserJAXB.unmarshal(file, objectClass);
		} catch (JAXBException e) {
		} finally {
			if (list != null) {
				listOfEmployees = WrapJAXB.getEmployees();
			}
		}
	}
}
