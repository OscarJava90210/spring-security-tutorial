package Service;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/*Класс для генерации чисел и дат*/
public   class ServiceGenerator  {

    public static Random random = new Random();

    /*Генерация числа*/
    public static Date randomInt() {
        return new Date(System.currentTimeMillis() - ThreadLocalRandom.current().nextInt(10 * 1000));
    }

    /*Генерация даты */
    public static Date randomDate() {
        return new Date(System.currentTimeMillis() - ThreadLocalRandom.current().nextLong(10 * 1000));
    }

    /*Генерация элемента из листа*/
    public static <T> T randomFromList(ArrayList<T> list) {
        return list.get(random.nextInt(list.size()));
    }

}





