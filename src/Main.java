/*
* 4.
* Объект - это экземлпяр класса, то есть для его создания нам нужно создать его
* Класс - описание объекта и совокупность полей и методов
*
* 5.
* Полиморфизм - реализация одних по смыслу действий, разным способом для других типов объектов
*
* Инкапсуляция - создание "капсулы" или совокупности полей и методов, близких по смыслу и защищаем данные от некорректных изменений
*
* Наследование - создание нового класса на основе уже существующего.
*
*
* 6.
* public - доступ отовсюда
*
* protected - доступ в том же классе, доступ из другого класса в том же пакете, доступ из наследников
*
* default - стандартный модификатор доступа: доступ в том же классе, доступ в том же пакете, доступ из наследников в том же пакете
*
* private - доступ только в том же классе
* используется для обеспечения инкапсуляции
*
*
*
*
* */


public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit("Alexander", 100);
        Mage mage = new Mage("Gandalf", 1000, 1000);

        Unit copyUnit = new Unit(unit);
        Mage copyMage = new Mage(mage);

        System.out.println("До изменения:");

        unit.printInfo();
        copyUnit.printInfo();

        System.out.println();

        mage.printInfo();
        copyMage.printInfo();

        copyUnit.setHealth(777);
        copyMage.setMana(9999);

        System.out.println("\nПосле изменения:");

        unit.printInfo();
        copyUnit.printInfo();

        System.out.println();

        mage.printInfo();
        copyMage.printInfo();
    }
}