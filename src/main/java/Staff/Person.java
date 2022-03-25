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

    @Override
    public String toString() {
        return "" + this.firstName + " " + this.middleName + " " + this.lastName;
    }

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

    public int compareTo(Person o) {
        return 0;
    }
}