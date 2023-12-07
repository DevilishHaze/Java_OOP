package OOP;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
Задание 1.2. Используя рассмотренные в данной работе примеры
1.3 и 1.4, выполнить задание согласно заданному варианту
в виде двух проектов:
1-й проект – без использования методов;
Вариант 3
Разработать класс для хранения информации о людях:
Фамилия, Имя, Отчество, возраст, размер_одежды
и реализовать алгоритм работы с массивом данных объектов, в котором
требуется:
– определить человека с самым большим размером одежды;
– определить средний размер одежды для людей старше 40 лет;
– упорядочить массив по возрастанию размера одежды;
– организовать поиск по фамилии, исправление одного из полей и вывод
полной информации о человеке после редактирования.
 */
public class OOP_var3 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества людей
        System.out.print("Введите количество людей: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine();

        Human[] chel = new Human[numPeople];

        // Ввод данных о каждом человеке
        for (int i = 0; i < chel.length; i++) {
            chel[i]=new Human();
            System.out.println("****************************");
            System.out.println("Введите данные о человеке #" + (i + 1));
            System.out.print("Фамилия: ");
            chel[i].setFirstName(scanner.nextLine());
            System.out.print("Имя: ");
            chel[i].setMiddleName(scanner.nextLine());
            System.out.print("Отчество: ");
            chel[i].setLastName(scanner.nextLine());
            System.out.print("Возраст: ");
            chel[i].setAge(scanner.nextInt());
            System.out.print("Размер одежды: ");
            chel[i].setClothingSize(scanner.nextInt());
            // Очистка буфера после ввода чисел
            scanner.nextLine();

        }
        System.out.println("****************************");

        // Определить человека с самым большим размером одежды
        int maxClothingSizePerson =0;
        for (int i =1;i< chel.length;i++) {
            if (chel[i].getClothingSize() > chel[maxClothingSizePerson].getClothingSize()) {
                maxClothingSizePerson = i;
            }
        }
        System.out.println("Человек с самым большим размером одежды:");
        System.out.println("Имя: " + chel[maxClothingSizePerson].getMiddleName());
        System.out.println("Фамилия: " + chel[maxClothingSizePerson].getFirstName());
        System.out.println("Размер: " +  chel[maxClothingSizePerson].getClothingSize());

        // Определить средний размер одежды для людей старше 40 лет
        int sumClothingSize = 0;
        int countPeopleOver40 = 0;
        for (Human person : chel) {
            if (person.getAge() >= 40) {
                sumClothingSize += person.getClothingSize();
                countPeopleOver40++;
            }
        }
        double averageClothingSize = sumClothingSize / countPeopleOver40;
        System.out.println("Средний размер одежды для людей старше 40 лет: " + averageClothingSize);

        // Упорядочить массив по возрастанию размера одежды

        Arrays.sort(chel, Comparator.comparingInt(Human::getClothingSize));

        // Вывести отсортированный массив
        System.out.println("Массив людей после сортировки по размеру одежды:");
        for (Human person : chel) {
            person.displayInfo();
        }

        // Поиск по фамилии, исправление одного из полей и вывод полной информации
        System.out.print("Введите фамилию для поиска: ");
        String searchLastName = scanner.nextLine();
        for (Human person : chel) {
            if (person.getLastName().equals(searchLastName)) {
                System.out.println("Найден человек с фамилией " + searchLastName);
                person.displayInfo();


                // Изменим возраст этого человека
                System.out.print("Введите новый возраст: ");
                int newAge = scanner.nextInt();
                person.setAge(newAge);

                // Выведем обновленную информацию
                System.out.println("После исправления возраста:");
               person.displayInfo();
                break;
            }
        }
    }
}
