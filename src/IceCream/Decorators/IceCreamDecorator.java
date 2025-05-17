package IceCream.Decorators;

import IceCream.IceCream;

public abstract class IceCreamDecorator implements IceCream {

        protected IceCream decoratedIceCream;

        public IceCreamDecorator(IceCream iceCream){
            this.decoratedIceCream = iceCream;
        }

        public String serve(){
            return  decoratedIceCream.serve();
        }


}
