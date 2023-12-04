package OOP2;

public class Phone_practos {
   public static void main(String[] args){
       Phone tel1 = new Phone(898825,"Iphone",240);
       Phone tel2 = new Phone(899934,"Samsung",220);
       Phone tel3 = new Phone(892545,"Nokia",200);
       System.out.println("Телефон 1:" + tel1);
       System.out.println("Телефон 2:" + tel2);
       System.out.println("Телефон 3:" + tel3) ;

      // System.out.println("на номер "+ tel1.getNumber());
       tel1.receiveCall("Мама",890410);

     //  System.out.println("на номер "+ tel2.getNumber());
       tel2.receiveCall("Друг",899512);

       //  System.out.println("на номер "+tel3.getNumber());
       tel3.receiveCall("Коллега",892578);


       //System.out.println(tel1.getNumber());
       int[] polychatelsPhones = { tel1.getNumber(), tel2.getNumber(), tel3.getNumber() };
               tel1.sendMessage("Привет! Как дела?", polychatelsPhones);


}}


