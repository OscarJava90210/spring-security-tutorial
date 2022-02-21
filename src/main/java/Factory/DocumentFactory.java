package Factory;

/**
 * Интерфейс для генерации классов Model.Document
 */


public interface DocumentFactory<T> {
    /**
     * @param <T> фабрика создания определенного типа документа
     */
    T createDocument();


}
