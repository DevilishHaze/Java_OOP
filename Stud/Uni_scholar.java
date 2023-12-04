package Stud;

public class Uni_scholar {
    public static void main(String[] args){
    Student student1 = new Student("Иван","Бубнов","ИС-31",4.7);
    Student student2 = new Student("Дарья","Архипова","ИС-41",5.0);
    Student student3 = new Student("Павел","Косоногов","ПОКС-41",4.5);

    Student aspirant1 = new Aspirant("Кристина","Семенова","АС-56",5.0,"Горизонты Пустоты.Загадки космоса");
    Student aspirant2 = new Aspirant("Юн","Сюн","СДВГ-64",4.0,"Спиральное развитие цивилизации людей");
    Student aspirant3 = new Aspirant("Игорь","Косягин","ОКР-61",4.85,"Что-то там дифференциалы");
Student[] students = {student1,student2,student3,aspirant1,aspirant2,aspirant3};
for (Student student : students){
    System.out.println("------------------------------------");
    System.out.println(student.toString() + "\nСтипендия " + student.getScolarship());
    
}
}}

