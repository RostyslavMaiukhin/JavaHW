package methods.Factory;

import entity.Price;
import entity.Title;
import entity.battery;
import entity.batteryType;

public interface creator {
    battery create(batteryType type, Price price, Title title);
}