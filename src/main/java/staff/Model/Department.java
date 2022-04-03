package staff.Model;

import java.text.MessageFormat;

/**
 * Реализация подкласса Персонал
 *
 * @author AAM
 **/
public class Department extends Staff {
    /**
     * Полное наименование
     */
    private final String fullName;
    /**
     * Краткое наименование
     */
    private final String shortName;
    /**
     * Руководитель
     */
    private final String chief;
    /**
     * Контактные телефоны
     */
    private final String contact;

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getChief() {
        return chief;
    }

    public String getContact() {
        return contact;
    }

    public Department(String fullName, String shortName, String chief, String contact) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.chief = chief;
        this.contact = contact;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
    /**
     * Вывод текста
     */
    String result = MessageFormat.
            format("Подразделение:  - ", new StringBuilder().
                    append(getFullName()).
                    append(". Руководитель:  - ").
                    append(getChief()).
                    toString()
            );
}
