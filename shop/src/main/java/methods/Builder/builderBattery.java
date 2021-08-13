package methods.Builder;

import entity.Price;
import entity.Title;
import entity.battery;

public interface builderBattery {

    builderBattery withTitle(Title title);

    builderBattery withPrice(Price price);

    battery toBuild();
}
