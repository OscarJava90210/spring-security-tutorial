package ServiceRepo;

import Model.Document;
import Exception.DocumentExistsException;
import Service.StorageList;

import java.util.ArrayList;

/**Repository для класса IncomingRepository
 */
public class IncomingRepository <T> extends StorageList {

    /**
     * Конструктор IncomingRepository
     */
    public IncomingRepository() {
    }

    /**
     * Поле объект для instance
     */
     public static IncomingRepository instance;

    /**Для получения Instance**/
    public static IncomingRepository getInstance()  {
        return instance;
    }

    /**
     * Метод для добавления документа
     */
    public void addDoc(Document document) throws DocumentExistsException {
        verification(document);
        documentArrayList.add(document);
    }
    /*Удаление*/
    public void remove (Document document) throws DocumentExistsException {
        boolean exist = false;
        for (int i = 0; i < documentArrayList.size(); i++) {
            if (documentArrayList.get(i).equals(document)) {
                documentArrayList.remove(i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new DocumentExistsException("Документ не найден");
        }
    }

    /*Проверка существующего рег.номера*/
    public void verification (Document document) throws DocumentExistsException {
        for (Document doc : documentArrayList) {
            if (doc.getRegNumDoc() == document.getRegNumDoc()) {
                throw new DocumentExistsException("Рег. номер уже существует");
            }
        }
    }

    /**
     * Метод для storage list*/
    ArrayList<Document> documentArrayList = new ArrayList<Document>(){
    };
}