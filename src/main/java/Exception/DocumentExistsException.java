package Exception;


/**
 * Класс для ошибок при создании документов

 */
public class DocumentExistsException extends Exception {

    public DocumentExistsException(String message) {
        super(message);
    }

}
