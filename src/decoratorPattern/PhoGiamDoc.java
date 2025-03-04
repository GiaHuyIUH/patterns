package decoratorPattern;

public class PhoGiamDoc implements Task {
    @Override
    public void showTasks() {
        System.out.println("Phụ trách khi giám đốc đi vắng");
    }
}
