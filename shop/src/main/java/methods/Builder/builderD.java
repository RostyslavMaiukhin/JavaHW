package methods.Builder;

import entity.D;
import entity.Price;
import entity.Title;

public class builderD {
    private final Price price;
    private final Title title;

    public builderD(Price price, Title title) {
        this.price = price;
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public Title getTitle() {
        return title;
    }


    public static class Builder implements builderBattery {
        private Price price;
        private Title title;

        @Override
        public builderD.Builder withTitle(Title title) {
            this.title = title;
            return this;
        }

        @Override
        public builderD.Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public D toBuild() {
            return new D(this.price, this.title);
        }
    }
}
