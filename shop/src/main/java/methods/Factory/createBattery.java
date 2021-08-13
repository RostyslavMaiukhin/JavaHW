package methods.Factory;

import entity.Price;
import entity.Title;
import methods.Builder.builderAA;
import methods.Builder.builderAAA;
import methods.Builder.builderD;
import entity.battery;
import entity.batteryType;

public class createBattery implements creator {
    @Override
    public battery create(batteryType type, Price price, Title title) {
        switch (type) {
            case AA:
                return new builderAA.Builder()
                        .withTitle(title)
                        .withPrice(price)
                        .toBuild();
            case AAA:
                return new builderAAA.Builder()
                        .withTitle(title)
                        .withPrice(price)
                        .toBuild();
            case D:
                return new builderD.Builder()
                        .withTitle(title)
                        .withPrice(price)
                        .toBuild();
            default:
                System.exit(-1);
        }
        return null;
    }
}