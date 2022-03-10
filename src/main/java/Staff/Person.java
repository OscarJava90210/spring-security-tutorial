package Staff;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Реализация подкласса Сотрудник
 *
 * @author AAM
 */
@XmlRootElement(name = "Person")
public class Person extends Staff implements Comparable<Person> {
    /**
     * Объявление полей
     */

    /*Поле Имя*/
    private String firstName;
    /*Поле Отчество*/
    private String middleName;
    /*Поле Фамилия*/
    private String lastName;
    /*Поле должность*/
    private String position;

    @Override
    public String toString() {
        return "" + this.firstName + " " + this.middleName + " " + this.lastName;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @XmlElement
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}