package methods.Builder;

import entity.AAA;
import entity.Price;
import entity.Title;

public class builderAAA {
    private final Price price;
    private final Title title;

    public builderAAA(Price price, Title title) {
        this.price = price;
        this.title = title;
    }


    public Title getTitle() {
        return title;
    }

    public Price getPrice() {
        return price;
    }

    public static class Builder implements builderBattery {
        private Price price;
        private Title title;

        @Override
        public builderAAA.Builder withTitle(Title title) {
            this.title = title;
            return this;
        }

        @Override
        public builderAAA.Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public AAA toBuild() {
            return new AAA(this.price, this.title);
        }
    }
}
