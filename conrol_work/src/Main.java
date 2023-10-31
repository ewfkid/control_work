
public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit(100, "John");
        Mage mage = new Mage(50, "Sara", 25);

        Unit unit1 = new Unit(unit);
        Mage mage1 = new Mage(mage);


        unit.printInfo();
        System.out.println();
        unit1.printInfo();
        System.out.println();
        mage.printInfo();
        System.out.println();
        mage1.printInfo();
    }
}

/*
4) Класс - это описание объекта, а объект это экземпляр класса, класс может существовать без объекта, а объект без класса - нет.
5) Принципы ООП:
    Наследование используется, когда нам нужно передать данные от одного класса (родительского) к другому (класс-наследник).
    Инкапсуляция - это объединение данных в классы и обеспечение доступа приватности внутри класса к ним.
    Полиморфизм - это решение одной и той же задачи разными методами.
6) Модификаторы доступа:
    public - можно вызывать в любом классе, в любом пакете.
    Используется для обмена данными, например между классами.
    priate - только в том же классе.
    Используется если нужно обезопасить код, тк у пользователя не будет прямого доступа к этим полям (например в инкапсуляции).
    default - можно вызвать в том же классе, в родительском классе и классе-наследнике, но в одном и том же пакете.
    Используется, когда мы не ставим никакой модификатор, по умолчанию.
    protected - можно вызвать в классе-наследнике в любом пакете, в родительском классе, но в том же пакете.
    Используется, если нужно дать доступ к полям, только внутри класса-наследника.
 */