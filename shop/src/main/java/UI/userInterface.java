package UI;

import entity.battery;
import entity.batteryType;
import lombok.SneakyThrows;
import methods.byDefault;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class userInterface {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    byDefault def = new byDefault();

    @SneakyThrows
    public void userInput(){
        System.out.println("Батарейка Пальчик - 1");
        System.out.println("Батарейка Мизинчик - 2");
        System.out.println("Батарейка ФигНайдешь - 3");

        switch (read.readLine()){
            case ("1"):
                battery AAA = def.create(batteryType.AAA);
                System.out.println(AAA);
                battery copyAAA = AAA.clone();
                System.out.println(copyAAA);
                System.out.println((AAA == copyAAA));
                break;
            case ("2"):
                battery AA = def.create(batteryType.AA);
                System.out.println(AA);
                battery copyAA = AA.clone();
                battery copLinkAA = AA;
                System.out.println((AA == copyAA));
                System.out.println((AA == copLinkAA));
                break;
            case ("3"):
                battery D = def.create(batteryType.D);
                System.out.println(D);
                battery copyD = D.clone();
                System.out.println((D == copyD));
                break;
            default:
                System.exit(-1);
        }
    }
}