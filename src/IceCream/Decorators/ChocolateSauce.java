package IceCream.Decorators;

import IceCream.IceCream;

public class ChocolateSauce extends IceCreamDecorator {

    public ChocolateSauce(IceCream iceCream){
        super(iceCream);
    }

    public String serve(){
        return super.serve()+" с шоколадова глазура";
    }

}
