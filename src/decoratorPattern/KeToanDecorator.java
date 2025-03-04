package decoratorPattern;

public class KeToanDecorator extends KeToan {
    public void showTasks() {
        super.showTasks();
        System.out.println("Tinh luong cho nhan vien");
    }
}
