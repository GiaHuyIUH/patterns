package statePattern;

public class EmployeeState {
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public void showTasks() {
        role.showTasks();
    }

    public static void main(String[] args) {
        EmployeeState emp = new EmployeeState();
        emp.setRole(new KeToan());
        emp.showTasks();

        EmployeeState emp2 = new EmployeeState();
        emp2.setRole(new NhanVien());
        emp2.showTasks();

    }
}
