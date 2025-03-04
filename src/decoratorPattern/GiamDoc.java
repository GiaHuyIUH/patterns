package decoratorPattern;

public class GiamDoc implements Task {
    @Override
    public void showTasks() {
        System.out.println("Quản lý toàn bộ công ty");
    }
}
