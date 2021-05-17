package ua.matyukhin.hw6;

public class Task1 {
    public static void main(String[] args) {

        Phone phone1 = new Phone();     //б)
        phone1.number = "0667777777";   //в)
        phone1.model = "K750i";         //в)
        phone1.weight = 200;            //в)

        Phone phone2 = new Phone();     //б)
        phone2.number = "0668888888";   //в)
        phone2.model = "1100";          //в)
        phone2.weight = 250;            //в)

        Phone phone3 = new Phone();     //б)
        phone3.number = "0669999999";   //в)
        phone3.model = "P900";          //в)
        phone3.weight = 300;            //в)

        System.out.println(phone1.number);//г)
        System.out.println(phone1.model); //г)
        System.out.println(phone1.weight);//г)
        System.out.println(" ");

        System.out.println(phone2.number);//г)
        System.out.println(phone2.model); //г)
        System.out.println(phone2.weight);//г)
        System.out.println(" ");

        System.out.println(phone3.number);//г)
        System.out.println(phone3.model); //г)
        System.out.println(phone3.weight);//г)
        System.out.println(" ");

        phone1.receiveCall("Петя");      //д)
        System.out.println(phone1.getNumber());//д)
        System.out.println(" ");

        phone2.receiveCall("Вася");      //д)
        System.out.println(phone2.getNumber());//д)
        System.out.println(" ");

        phone3.receiveCall("Катя");      //д)
        System.out.println(phone3.getNumber());//д)
        System.out.println(" ");


    }

}
