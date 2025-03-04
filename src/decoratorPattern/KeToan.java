package decoratorPattern;

public class KeToan implements Task {
    @Override
    public void showTasks() {
        System.out.println("Tính toán tiền cho Công Ty, nộp tiền vào TK");
    }
}
