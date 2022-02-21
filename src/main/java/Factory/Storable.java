package Factory;

/**
 * Интерфейс с методами для хранения документов
 */
public interface Storable {
    /**
     * Метод-геттер
     *
     * @return рег.номер документа
     */
     int getId();
    /**
     * Метод-геттер
     *
     * @return имя документа
     */
     String getTableName();

}
