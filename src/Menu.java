import java.util.Scanner;

// класс Меню

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

// метод выбора действий в Меню

    public String selectFunction() {
        System.out.print("""
                \nМЕНЮ приложения 'Калькулятор'
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. сложение двух чисел
                2. вычитание двух чисел
                3. деление двух чисел
                4. умножение двух чисел
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }
}