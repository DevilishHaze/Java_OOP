package OOP;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class OOP_var3metod {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ввод количества людей
                System.out.print("Введите количество людей: ");
                int numPeople = scanner.nextInt();
                scanner.nextLine();

                Human[] chel = new Human[numPeople];

                // Ввод данных о каждом человеке
                for (int i = 0; i < chel.length; i++) {
                        chel[i] = new Human();
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
                System.out.println("Максимальный размер:");
                MaxSize(chel);
                System.out.println("\n****************************");
                System.out.println("\nCредний размер людей за 40:");
                AvgSize40(chel);
                System.out.println("****************************");
                SortArray(chel);
                System.out.println("****************************");
                System.out.println("Изменение и поиск: ");
                SearchAndChange(chel);
                System.out.println("****************************");

        }

        public static int MaxSize(Human[] chel) {
                int maxClothingSizePerson = 0;
                int max =chel[maxClothingSizePerson].getClothingSize();
                for (int i = 0; i < chel.length; i++) {
                        if (chel[i].getClothingSize() > max) {
                               max = chel[i].getClothingSize();
                               maxClothingSizePerson=i;
                        }
                }System.out.print(max);
                return max;

        }

        public static double AvgSize40(Human[] chel) {
                int sumClothingSize = 0;
                int countPeopleOver40 = 0;
                for (Human person : chel) {
                        if (person.getAge() >= 40) {
                                sumClothingSize += person.getClothingSize();
                                countPeopleOver40++;
                        }
                }
                double averageClothingSize = sumClothingSize / countPeopleOver40;
                System.out.println(averageClothingSize);
                return averageClothingSize;
        }

        public static Human[] SortArray(Human[] chel) {
                Arrays.sort(chel, Comparator.comparingInt(Human::getClothingSize));
                System.out.println("Отсортированный массив:");
                for (Human person : chel) {
                       person.displayInfo();
                }
                return chel;
        }

        public static Human[] SearchAndChange(Human[] chel) {
                Scanner scanner = new Scanner(System.in);
   do {
           System.out.print("Введите фамилию: ");
           String searchLastName = scanner.nextLine();
           boolean personFound = false;

           for (Human person : chel) {
                   if (person.getLastName().equals(searchLastName)) {
                           System.out.println("Найден человек с фамилией " + searchLastName);
                          person.displayInfo();

                           // Изменим возраст этого человека
                           System.out.print("Введите новый возраст: ");
                           int newAge = scanner.nextInt();
                           person.setAge(newAge);
                           System.out.println("После исправления возраста:");
                        person.displayInfo();
                           personFound = true; // Устанавливаем флаг, что человек найден
                           break;
                   }
           }

           if (!personFound) {
                   System.out.println("Человек с такой фамилией не найден!");
           }
           else{break;}
   }
   while(true);
   System.out.println("Новое значение среднего размера");
   AvgSize40(chel);
   return(chel);
        }
}