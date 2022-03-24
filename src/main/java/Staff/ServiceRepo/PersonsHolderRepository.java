package Staff.ServiceRepo;

import Staff.Service.ParserJAXB;
import Staff.Service.PersonListHolder;
import javax.xml.bind.JAXBException;
import java.io.File;


/**
 * Класс репозиторий для объекта Person
 *
 * @author AAM
 **/
public class PersonsHolderRepository {

    public static PersonListHolder getListOfEmployees(File file) {
        try {
            return ParserJAXB.unmarshal(file, PersonListHolder.class);
        } catch (JAXBException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
