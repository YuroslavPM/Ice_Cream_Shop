package Factory;

import IceCream.*;

public class IceCreamFactory {
    public static IceCream createIceCream(IceCreamType type) {
        return switch (type) {
            case VANILLA -> new VanillaIceCream();
            case CHOCOLATE -> new ChocolateIceCream();
            case STRAWBERRY -> new StrawberryIceCream();
        };
    }
}
