import Factory.IceCreamFactory;
import Factory.IceCreamType;
import IceCream.Decorators.ChocolateChips;
import IceCream.Decorators.ChocolateSauce;
import IceCream.IceCream;
import Shop.IceCreamShop;
import IceCream.Decorators.IceCreamDecorator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IceCreamShop shop = IceCreamShop.getInstance();
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("\nДобре дошли в магазина за сладолед!");
            System.out.println("Изберете вид сладолед:");
            System.out.println("1. Ванилов");
            System.out.println("2. Шоколадов");
            System.out.println("3. Ягодов");
            System.out.println("0. Изход");

            System.out.print("Ваш избор: ");
            int choice = scanner.nextInt();
            if (choice == 0) break;

            IceCreamType type;
            switch (choice) {
                case 1 -> type = IceCreamType.VANILLA;
                case 2 -> type = IceCreamType.CHOCOLATE;
                case 3 -> type = IceCreamType.STRAWBERRY;
                default -> {
                    System.out.println("Невалиден избор. Опитайте отново.");
                    continue;
                }
            }

            IceCream iceCream = IceCreamFactory.createIceCream(type);

            // Избор на добавки
            System.out.println("Желаете ли добавки?");
            System.out.println("1. Шоколадова глазура");
            System.out.println("2. Шоколадови пръчици");
            System.out.println("3. И двете");
            System.out.println("0. Без добавки");

            System.out.print("Ваш избор: ");
            int addonChoice = scanner.nextInt();

            switch (addonChoice) {
                case 1 -> iceCream = new ChocolateSauce(iceCream);
                case 2 -> iceCream = new ChocolateChips(iceCream);
                case 3 -> iceCream = new ChocolateChips(new ChocolateSauce(iceCream));
                case 0 -> {} // без добавки
                default -> System.out.println("Невалиден избор. Продължаваме без добавки.");
            }

            shop.serveCustomer(iceCream);
        }

        System.out.println("Благодарим Ви! Заповядайте отново.");



        }


    }
