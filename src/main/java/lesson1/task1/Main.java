package lesson1.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создаём объект собаки");
        Dog dog = new Dog();
        System.out.println("Объект собаки создан");

        dog.age = 7;
        dog.color = "Черный";

        System.out.println("Возраст - " + dog.age);
        System.out.println("Цвет - " + dog.color);

        dog.bark();
        dog.sleep();

        Dog secondDog = new Dog(5);

    }

}
