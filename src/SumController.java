// класс управления действием - Сложение
public class SumController implements MainController{
    View view;
    SumModel model;

    public SumController(View view, SumModel model) {
        this.view = view;
        this.model = model;
    }
    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "ОТВЕТ - сумма: ");
    }
}