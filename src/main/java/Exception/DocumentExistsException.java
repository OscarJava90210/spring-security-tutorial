package Exception;


/**
 * Класс для ошибок при создании документов
 *
 * @author AAM
 */
public class DocumentExistsException extends Exception {

    public DocumentExistsException(String message) {
        super(message);
    }

}
