package decoratorPattern;

public class PhoGiamDocDecorator extends PhoGiamDoc {
    public void showTasks() {
        super.showTasks();
        System.out.println("Duyệt bảng lương");
    }
}
