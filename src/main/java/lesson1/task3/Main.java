package lesson1.task3;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(3, "Черный");
        Cat secondCat = new Cat();

 //       secondCat.age = -5;

        secondCat.setAge(5);
        cat.setAge(7);

        secondCat.setAge(-9);
        System.out.println("Возраст кошки - " + secondCat.getAge());

        secondCat.setAge(3);
        System.out.println("Возраст кошки - " + secondCat.getAge());


    }
}
