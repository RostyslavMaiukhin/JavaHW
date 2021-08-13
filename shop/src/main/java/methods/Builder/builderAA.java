package methods.Builder;

import entity.AA;
import entity.Price;
import entity.Title;

public class builderAA {
    private final Price price;
    private final Title title;

    public builderAA(Price price, Title title) {
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
        public builderAA.Builder withTitle(Title title) {
            this.title = title;
            return this;
        }

        @Override
        public builderAA.Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        @Override
        public AA toBuild() {
            return new AA(this.price, this.title);
        }

    }
}
