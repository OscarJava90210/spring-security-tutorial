package Staff.Start;

import Staff.Service.PersonListHolder;
import Staff.ServiceRepo.PersonsListHolderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
/**
 * Точка входа в программу
 *
 * @author AAM
 **/
public class Starter {

    public static void main(String[] args) throws IOException {
        File personsFile = new File("C:\\Project\\foreign\\My_project\\src\\main\\resources\\persons.xml");
        PersonListHolder listOfEmployees = PersonsListHolderRepository.getListOfEmployees(personsFile);
        /**
          * @method to writeJson
          **/
        File fileToWriteJson = new File("C:\\Users\\Асхат\\Documents\\");
        if (!fileToWriteJson.exists()) {
            fileToWriteJson.getParentFile().mkdir();
            fileToWriteJson.createNewFile();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(fileToWriteJson, fileToWriteJson);

    }
}