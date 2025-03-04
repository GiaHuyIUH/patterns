package decoratorPattern;

public class NhanVien implements Task {
    @Override
    public void showTasks() {
        System.out.println("Pha trà, giữ xe ");
    }
}
