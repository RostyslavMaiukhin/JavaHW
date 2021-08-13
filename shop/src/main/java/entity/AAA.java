package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class AAA extends battery{

    public AAA(Price price, Title title) {
        super(price,title);
    }

    @Override
    public String toString() {
        return "AAA " +
                "title: "+this.getTitle()+
                ", price :"+this.getPrice()
                ;
    }
}