package staff.Model;

import java.text.MessageFormat;

/**
 * Реализация подкласса  Организация
 *
 * @author AAM
 **/
public class Organization extends Staff {
    /**
     * Полное наименование
     */
    private String fullName;
    /**
     * Краткое наименование
     */
    private String shortName;
    /**
     * Руководитель
     */
    private String chief;
    /**
     * Контактные телефоны
     */
    private String contact;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contactPhoneNumbers) {
        this.contact = contactPhoneNumbers;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public Organization(String fullName, String shortName, String chief, String contact) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.chief = chief;
        this.contact = contact;
    }
    /**
     * Вывод текста
     */
    String result = MessageFormat.format(" Организация:  - ",
            new StringBuilder().
                    append(getFullName()).
                    append(". Руководитель:  - ").
                    append(getChief()).toString());
}
