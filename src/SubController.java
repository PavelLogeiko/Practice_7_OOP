// класс управления действием - Вычитание
public class SubController implements MainController {
    View view;
    SubModel subModel;

    public SubController(View view, SubModel subModel) {
        this.view = view;
        this.subModel = subModel;
    }

    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        int result = subModel.result();
        view.print(result, "ОТВЕТ - разность: ");
    }
}