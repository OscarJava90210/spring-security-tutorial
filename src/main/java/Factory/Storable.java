package Factory;

/**
 * Интерфейс с методами для хранения документов
 */
public interface Storable {
    /**
      *
      * @return рег.номер документа
      */
     int getId();
    /**
      * 
      * @return имя документа
      */
     String getTableName();

}
