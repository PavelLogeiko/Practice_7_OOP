// класс управления действием - Деление
public class DivController implements MainController {
    View view;
    DivModel divModel;

    public DivController(View view, DivModel divModel) {
        this.view = view;
        this.divModel = divModel;
    }

    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        int result = divModel.result();
        view.print(result, "ОТВЕТ - частное: ");
    }
}