package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class AA extends battery {

    public AA(Price price, Title title) {
        super(price, title);
    }

    @Override
    public String toString() {
        return "AA " +
                "title: " + this.getTitle() +
                ", price :" + this.getPrice()
                ;
    }
}