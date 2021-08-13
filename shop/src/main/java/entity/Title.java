package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public final class Title  implements Cloneable{
    private String text;

    public Title(String text) {
        this.text = text;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}