package staff.Model;

import java.text.MessageFormat;

/**
 * Реализация класса персонал
 *
 * @author AAM
 **/
public abstract class Staff {
    /*Поле Id*/
    private int id;
    /**
     * Вывод текста
     */
    String result = MessageFormat.format(
             "Элемент организационной структуры: - ",
                    new StringBuilder().
                    append(getId()).
                    toString());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int compareTo(Person o);
}