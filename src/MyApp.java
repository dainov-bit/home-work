class Box<T> {
    private T name;

    public Box(T name) {
        this.name = name;
    }

    public T get() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }
        Box box = (Box) o;
        return this.name == box.get();
    }

    @Override
    public int hashCode() {
        int number = 31;
        return number * this.name.hashCode();
    }

    public void set(T name) {
        this.name = name;
    }
}

public class MyApp {
    public static void main(String[] args) {
        System.out.println("И так, давайте создадим наши коробки.");
        Box<String> car1 = new Box("Car");
        System.out.println("Первая коробка имеет имя " + car1.get());
        Box<String> bus = new Box("Bus");
        System.out.println("Вторая коробка имеет имя " + bus.get());
        System.out.println("Давайте узнаем, идентичны ли обе коробки или нет.\n" + ((car1.equals(bus) ? "Да, коробки идентичны" : "Нет, коробки не похожи")));
        System.out.println("Однако, у нас есть маркер, который может переписать имя второй коробки.");
        bus.set("Car");
        System.out.println("Вторая коробка теперь называется " + bus.get());
        System.out.println("Давайте еще раз проверим, идентичны ли коробки или нет.\n" + ((car1.equals(bus) ? "Да, теперь коробки идентичны" : "Нет, коропки сново не идентичны")));
    }
}
