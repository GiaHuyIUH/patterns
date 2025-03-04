package statePattern;

public class PhoGiamDoc implements Role {
    @Override
    public void showTasks() {
        System.out.println("Phụ trách khi giám đốc đi vắng");
    }
}
