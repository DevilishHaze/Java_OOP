
package OOP;
import java.util.Scanner;

public class OOP_pr1 {
   public static void main(String[] args){
       Scanner scan= new Scanner(System.in,"UTF-8");
System.out.println("Введите количество сотрудников=>");
int kol=scan.nextInt();
scan.nextLine();

Sotrudnik []sotrudniks= new Sotrudnik[kol];
System.out.println("Введите ин-фу  o каждом сотруднике");
        for(int i =0;i< sotrudniks.length;i++){
            sotrudniks[i]=new Sotrudnik();
            System.out.println("Введите фамилию =>");
            sotrudniks[i].surname=scan.nextLine();
            System.out.println("Введите имя =>");
            sotrudniks[i].name=scan.nextLine();
            System.out.println("Введите отчество =>");
            sotrudniks[i].otche=scan.nextLine();
            System.out.println("Введите должность =>");
            sotrudniks[i].pos=scan.nextLine();
            System.out.println("Введите оклад =>");
            sotrudniks[i].oklad=scan.nextInt();
            scan.nextLine();

        }
       System.out.println("\n Сотрудники фирмы:\n фам \t имя \t отчест+ \t долж\t оклад");
       for(Sotrudnik x:sotrudniks){
           System.out.println(x.surname+"\t"+x.name+"\t"+x.otche+"\t"+x.pos+"\t\t"+x.oklad);
       }
   }

    /*
        Пример 1.1. Ввести информацию о сотрудниках фирмы (фами-
        лия, имя, отчество, должность, оклад). Вывести на экран информацию
        в табличном виде.
        */
    static class Sotrudnik {
        String surname, name, otche, pos;
        int oklad;
    }
}
