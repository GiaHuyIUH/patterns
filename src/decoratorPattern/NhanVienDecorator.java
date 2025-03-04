package decoratorPattern;

public class NhanVienDecorator extends NhanVien{
   public void showTasks() {
       super.showTasks();
       System.out.println("Giữ xe cho khách hang");
   }
}
