package IceCream.Decorators;

import IceCream.IceCream;

public class ChocolateChips extends IceCreamDecorator{

    public ChocolateChips(IceCream iceCream){
        super(iceCream);
    }

    public String serve(){
        return super.serve()+" с шоколадови пръчици";
    }



}
