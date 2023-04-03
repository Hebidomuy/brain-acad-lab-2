package Lab17;

enum PositionsOfEmployees {
    DIRECTOR("Директор магазина, может управлять кадрами, и ценами"),
    ADMINISTRATOR("Администратор магазина, может добавлять товары и редактировать их описание"),
    MANAGER("Менеджер магазина, может общаться с клиентами"),
    CLIENT("Клиент магазина, может покупать товары и пользоваться дисконтом"),
    ANONYMOUS("Анонимный пользователь, может покупать товары и/или авторизоваться");

    private String work;

    PositionsOfEmployees(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }
}

