package methods;

import entity.Price;
import entity.Title;
import entity.battery;
import entity.batteryType;
import methods.Factory.createBattery;

public final class byDefault {
    createBattery creator = new createBattery();

    public battery create(batteryType type) {
        switch (type) {
            case AAA:
                return defaultAAA();
            case AA:
                return defaultAA();
            case D:
                return defaultD();
            default:
                System.exit(-1);
        }
        return null;
    }

    public battery defaultAAA() {
        return creator.create(batteryType.AAA, new Price(60), new Title("Panasonic"));
    }

    public battery defaultAA() {
        return creator.create(batteryType.AAA, new Price(40), new Title("Duracell"));
    }

    public battery defaultD() {
        return creator.create(batteryType.AAA, new Price(90), new Title("СИЛА"));
    }
}
