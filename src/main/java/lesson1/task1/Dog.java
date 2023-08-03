package lesson1.task1;

public class Dog {

    int age;
    String color;

    public Dog() {
        System.out.println("Создаём конструктор класса Dog");
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void sleep() {

        System.out.println("Собака спит");
    }

    public void bark() {

        System.out.println("Гав-гав!");
    }

}
