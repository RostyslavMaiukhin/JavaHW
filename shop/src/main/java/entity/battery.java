package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class battery implements Cloneable{
    private Title title;
    private Price price;


    public battery(Price price, Title title) {
        this.price = price;
        this.title = title;
    }

    @Override
    public battery clone() throws CloneNotSupportedException {
        return (battery) super.clone();
    }
}