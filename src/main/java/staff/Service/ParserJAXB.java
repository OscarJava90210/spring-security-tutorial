package staff.Service;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory ;

/**
 * Класс для генерации JAXB
 *
 * @author AAM/
 **/
public class ParserJAXB {

    private static Logger logger = LoggerFactory.getLogger(ParserJAXB.class);

    public static <T> T unmarshal(File file, Class<T> objectClass) throws JAXBException {

        try {
            JAXBContext context = JAXBContext.newInstance(objectClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T)  unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            logger.info(e.getMessage());
        }
        return null;
    }
}
