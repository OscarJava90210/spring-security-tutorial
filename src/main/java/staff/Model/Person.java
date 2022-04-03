package staff.Model;

import javax.xml.bind.annotation.XmlElement ;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.MessageFormat;

/**
 * Реализация подкласса Сотрудник
 *
 * @author AAM
 **/
@XmlRootElement(name = "Person")
public class Person extends Staff implements Comparable<Person> {
    /**
     * Имя
     */
    private String firstName;
    /**
     * Отчество
     */
    private String middleName;
    /**
     * Фамилия
     */
    private String lastName;
    /**
     * Должность
     */
    private String position;

    @XmlElement(name = "name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement (name = "secondName")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @XmlElement (name = "surname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement (name = "position")
    public String getPosition(){
        return  position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public Person(String firstName, String middleName, String lastName, String position) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
    }

    public int compareTo(Person o) {
        return 0;
    }
    /**
     * Вывод текста
     */
    String result = MessageFormat.format(
            new StringBuilder().
                    append("Имя: - ").
                    append(getFirstName()).
                    append("Фамилия:- ").
                    append(getMiddleName()).
                    append("Должность: - ").
                    append(getPosition()).toString());
}