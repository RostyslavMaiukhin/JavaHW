package ua.matyukhin.hw6;

public class Phone {    //а)
    String number;
    String model;
    int weight;

    public void receiveCall(String name) {      //д)
        System.out.println("Звонит " + name);
    }

    public String getNumber() {     //д)
        return this.number;
    }

    Phone(String number, String model, int weight) {       //е)
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {       //ж)
        this.number = number;
        this.model = model;
    }

    Phone() {      //з)
    }
}
