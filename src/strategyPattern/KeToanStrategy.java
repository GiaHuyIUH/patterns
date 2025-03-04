package strategyPattern;

public class KeToanStrategy implements TaskStrategy {
    public void showTasks() {
        System.out.println("Tính toán tiền cho Công Ty, nộp tiền vào TK");
    }
}
