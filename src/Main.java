// точка старта и запуск компонент взаимодействия с пользователем
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nВы находитесь в приложении 'Калькулятор', которое позволяет выполнять арифметические" +
                " действия с целочисленными значениями." );
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new SumModel()), new SubController(v,
                new SubModel()), new DivController(v, new DivModel()), new MultController(v,
                new MultModel()), scanner, new Menu(scanner));
        p.start();
    }
}