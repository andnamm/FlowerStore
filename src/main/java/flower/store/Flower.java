package flower.store;

import lombok.Getter;
import lombok.Setter;

public class Flower {
    @Getter
    private double sepalLength;
    @Setter
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}

