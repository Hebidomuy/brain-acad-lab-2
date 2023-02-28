package Lab14;

public class MainShop {
    public static void main(String[] args) {
        Manager manager = new Manager("re re re", 5555665, "asdasd");
        Cashier cashier = new Cashier("d d d", 413435);
        SecurityGuard securityGuard = new SecurityGuard("a a a", 265363);
        Client client = new Client("c c c", 259539);

        Shop shop = new Shop("Ivanov Ivan Sergeevish", "Novokyznetskya 5", manager, cashier, securityGuard, client);
        shop.openUp();
        shop.sellGoods();
        shop.goToLunch();


        Test[] humans = new Test[3];
        humans[0] = new SecurityGuard("asd", 5555);
        humans[1] = new Client("asd", 5555);
        humans[2] = new Manager("asd", 5555, "asdas");

        for (int i = 0; i < 3; i++) {
            humans[i].sayHello();
        }
    }
}
