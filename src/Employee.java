public class Employee {
    private String position;

    public Employee(String position) {
        this.position = position;
    }

    public void showTasks() {
        switch (position) {
            case "Giám đốc":
                System.out.println("Quản lý toàn bộ công ty");
                break;
            case "Phó Giám Đốc":
                System.out.println("Phụ trách khi giám đốc đi vắng");
                break;
            case "Kế Toán":
                System.out.println("Tính toán tiền cho Công Ty, nộp tiền vào TK");
                break;
            case "Nhân Viên":
                System.out.println("Pha trà, giữ xe");
                break;
            default:
                System.out.println("Không có nhiệm vụ");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kế Toán");
        emp.showTasks();
    }
}
