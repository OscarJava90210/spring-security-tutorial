package Staff.Service;

import Model.Document;
import Staff.Person;
import Staff.ServiceRepo.Repository;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import org.slf4j.LoggerFactory;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.logging.Logger;

/* Класс для порядкового вывода в формате JSON
* @author AAM
* */
public class ReportJSON {

	private static Logger logger = (Logger) LoggerFactory.getLogger(ReportJSON.class);
	public static void convertReportToJSON(SortedMap<Person, SortedSet<Document>> report) {
		
		Gson gson = new Gson();
		
		if (Repository.report.size() != 0) {
			for (Map.Entry<Person, SortedSet<Document>> link : report.entrySet()) {
				try (Writer writer = new FileWriter("C:\\Users\\Task2\\Desktop\\" + link.getKey() + ".json")) {
					String json = gson.toJson(link.getValue());
					writer.write(json);
				} catch (JsonIOException | IOException e) {
					logger.info(e.getMessage());
				}
			}
		}		
	}
}
