package Shop;

import IceCream.IceCream;

public class IceCreamShop {

    private static IceCreamShop instance;

    private IceCreamShop(){

    }

    public static IceCreamShop getInstance(){
        if (instance==null){
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void serveCustomer(IceCream iceCream){
        System.out.println("Сервираме: "+iceCream.serve());
    }

}
