package ServiceRepo;

import Model.Document;
import java.util.ArrayList;
import Exception.DocumentExistsException;
import Service.StorageList;

/**
  *Repository для класса task
  */
public  class TaskRepository extends StorageList {

    /**Конструктор TaskRepository*/
    public TaskRepository() {
    }

    /**
      * Поле объект для instance
      */
    public static TaskRepository instance;

    /**
      *Для получения Instance
      */
    public static TaskRepository getInstance() {
        return instance;
    }
    /**
      * Метод для добавления документа
      */
    public void addDoc(Document document) throws DocumentExistsException {
        verification(document);
        documentArrayList.add(document);
    }

    /**
      *Метод для Удаления документа
      */
    public void remove(Document document) throws DocumentExistsException {
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
    /*
     *Проверка существующего рег.номера
     */
    public void verification(Document document) throws DocumentExistsException {
        for (Document doc : documentArrayList) {
            if (doc.getRegNumDoc() == document.getRegNumDoc()) {
                throw new DocumentExistsException("Рег. номер уже существует");
            }
        }
    }
    /**
      * Метод для storage list
      */
    ArrayList<Document> documentArrayList = new ArrayList<Document>(){
    };
}