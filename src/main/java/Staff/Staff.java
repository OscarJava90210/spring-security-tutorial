package Staff;
/**
 * Реализация класса персонал
 *
 * @return id -> name
 *
 * @author AAM
 **/
public abstract class Staff {
    /*Поле Id*/
    private int id;

    @Override
    public String toString() {
        return "Элемент организационной структуры " + this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract int compareTo(Person o);
}