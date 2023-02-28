package Lab14;

import java.util.Objects;

public class Shop {
    String name;
    String address;
    private Manager manager;
    private Cashier cashier;
    private SecurityGuard securityGuard;
    private Client client;

    public Shop(String name, String address, Manager manager, Cashier cashier, SecurityGuard securityGuard, Client client) {
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.cashier = cashier;
        this.securityGuard = securityGuard;
        this.client = client;
    }

    public void openUp() {
        System.out.println("Магазин открываеться");
        this.manager.comeToWork();
        this.cashier.comeToWork();
        this.securityGuard.comeToWork();
    }

    public void sellGoods() {
        System.out.println("Магазин начинает продавать товары");
        this.client.learnAboutTheProduct();
        this.manager.toDoWork();
        this.client.buy(123);
        this.cashier.toDoWork();
        this.securityGuard.toDoWork();
    }

    public void goToLunch() {
        System.out.println("Магазин закрывается на обед");
        this.manager.goToLunch();
        this.cashier.goToLunch();
        this.securityGuard.goToLunch();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(securityGuard, shop.securityGuard) &&
                Objects.equals(client, shop.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, securityGuard, client);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", securityGuard=" + securityGuard +
                ", client=" + client +
                '}';
    }
}
