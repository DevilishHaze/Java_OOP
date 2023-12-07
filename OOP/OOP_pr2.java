package OOP;
import java.util.Scanner;
/*
Пример 1.2. Ввести информацию о сотрудниках фирмы (фами-
лия, имя, отчество, должность) и их детях (имя, возраст). Вывести на
экран информацию в табличном виде.
Укрупненный алгоритм.
1 Ввести количество сотрудников.
2 Для каждого сотрудника
а) ввести фамилию, имя, отчество, должность и количество
детей;
б) если количество детей не равно нулю, то
для каждого ребенка
3 Для каждого сотрудника
вывести информацию о нем и его детях.
4 Закончить.
 */
class Sotrudnik{
    String fam,im,otch, doljnost ;
    int kolDet;
    Rebenok []reb=null;
}
class Rebenok{
    String imaR;
    int vozrastR;
}
public class OOP_pr2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in,"UTF-8");
            System.out.println("Введите количество сотрудников => ");
            int kol=sc.nextInt();
            sc.nextLine(); // очистка буфера
    Sotrudnik []sotr=new Sotrudnik[kol];
System.out.println("Введите информацию о каждом сотруднике: ");
for (int i = 0; i < sotr.length; i++) {
        sotr[i]=new Sotrudnik();
        System.out.print("Введите фамилию "+(i+1)+" сотрудника => ");
        sotr[i].fam= sc.nextLine();
        System.out.print("Введите его имя => ");
        sotr[i].im=sc.nextLine();
        System.out.print("Введите его отчество => ");
        sotr[i].otch=sc.nextLine();
        System.out.print("Введите его должность => ");
        sotr[i].doljnost=sc.nextLine();
        System.out.print("Введите количество детей => ");
        sotr[i].kolDet=sc.nextInt();
        sc.nextLine(); // очистка буфера
        if (sotr[i].kolDet!=0) {
            sotr[i].reb=new Rebenok[sotr[i].kolDet];
            System.out.println("Дети => ");
            for (int j = 0; j < sotr[i].reb.length; j++) {
                sotr[i].reb[j]=new Rebenok();
                System.out.print("Введите имя "+(j+1)+" ребенка => ");
                sotr[i].reb[j].imaR = sc.nextLine();
                System.out.print("Введите его возраст => ");
                sotr[i].reb[j].vozrastR = sc.nextInt();
                sc.nextLine(); // очистка буфера
            } } }
// ВЫВОД ИНФОРМАЦИИ О СОТРУДНИКАХ
System.out.println("\nСотрудники фирмы \n фам \t имя \t отч \t должность");
for (Sotrudnik s : sotr) {
        System.out.print(s.fam+ "\t"+s.im + "\t"+ s.otch + "\t "+ s.doljnost);
        System.out.println("\n Дети: ");
        for (Rebenok r : s.reb)
            System.out.println("\t\t\t"+ r.imaR+ "\t\t"+ r.vozrastR);
        System.out.println("");
    }
} }