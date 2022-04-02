package staff.ServiceRepo;

import staff.Service.ParserJAXB;
import staff.Service.PersonListHolder;
import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * Класс репозиторий для объекта Person
 *
 * @author AAM
 **/
public class PersonsListHolderRepository {

    public static PersonListHolder getListOfEmployees(File file) {
        try {
            return ParserJAXB.unmarshal(file, PersonListHolder.class);
        } catch (JAXBException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
