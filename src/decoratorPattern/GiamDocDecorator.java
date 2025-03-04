package decoratorPattern;

public class GiamDocDecorator extends GiamDoc {
    public void showTasks() {
        super.showTasks();
        System.out.println("Xây dung chien luoc kinh doanh");
    }
}
