package Exception;

/**
 * Класс для ошибок при создании документов
 */
public class DocumentExistsException extends Exception {

 /**
     * метод обработки исключения
     *
     * @param message информация об ошибке
     */
    public DocumentExistsException(String message) {
        super(message);
    }
}
