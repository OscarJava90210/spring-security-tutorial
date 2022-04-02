package staff.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * Класс для  записи Json
 *
 * @author AAM/
 **/
public class ReportJson {
    public void writeJson() throws IOException {

        File fileToWriteJson = new File("C:\\Users\\Асхат\\Documents\\file.json");
        if (!fileToWriteJson.exists()) {
            fileToWriteJson.getParentFile().mkdir();
            fileToWriteJson.createNewFile();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(fileToWriteJson, fileToWriteJson);
    }
}




