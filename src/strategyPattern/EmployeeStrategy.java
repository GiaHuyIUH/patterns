package strategyPattern;
class EmployeeStrategy {
    private TaskStrategy strategy;

    public EmployeeStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void showTasks() {
        strategy.showTasks();
    }

    public static void main(String[] args) {
        EmployeeStrategy emp = new EmployeeStrategy(new KeToanStrategy());
        System.out.println("KeToanStrategy:");
        emp.showTasks();

        emp.setStrategy(new NhanVienStrategy());
        System.out.println("NhanVienStrategy:");
        emp.showTasks();
    }
}
