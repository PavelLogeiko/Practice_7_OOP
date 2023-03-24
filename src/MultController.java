// класс управления действием - Умножение
public class MultController implements MainController {
    View view;
    MultModel multModel;
    public MultController(View view, MultModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }

    @Override
    public void doIt() {
        int a = view.getValue();
        int b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        int result = multModel.result();
        view.print(result, "ОТВЕТ - произведение: ");
    }
}