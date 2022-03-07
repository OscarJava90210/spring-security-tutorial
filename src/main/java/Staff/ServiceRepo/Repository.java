package Staff.ServiceRepo;

import Model.Document;
import Staff.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

/*Класс для генерации объекта Person
 *
 * @author AAM
 * */
public class Repository {

    private static Logger logger = LoggerFactory.getLogger(Repository.class);

    public static SortedSet<Document> STORAGE = new TreeSet<Document>();

    public static SortedMap<Person, SortedSet<Document>> report = new TreeMap<Person, SortedSet<Document>>();


    /*
     *@method Формирование отчета
     */
    private static void formReport() {

        Document[] StorageList = new Document[0];

        for (Document document : StorageList) {
            if (!report.containsKey(document.getAuthorOfDoc())) {
                report.put(document.getAuthorOfDoc(), new TreeSet<Document>());
            }
            report.get(document.getAuthorOfDoc()).add(document);
        }
    }

    /*
     * @method Вывод отчета
     */
    public static void printReport() {

        formReport();

        if (report.size() != 0) {
            for (Map.Entry<Person, SortedSet<Document>> link : report.entrySet()) {
                logger.info(link.getKey() + link.getValue().toString().replaceAll("\\[|,\\s", "\n\t").replaceAll("\\]", ""));
            }
        } else {
            logger.info("Документ еще не создан");
        }
    }
}
