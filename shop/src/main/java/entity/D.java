package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class D extends battery {

    public D(Price price, Title title) {
        super(price, title);
    }

    @Override
    public String toString() {
        return "D " +
                "title: " + this.getTitle() +
                ", price :" + this.getPrice()
                ;
    }
}