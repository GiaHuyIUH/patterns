package decoratorPattern;

public class main {
    public static void main(String[] args) {
        Task nhanVien = new NhanVien();
        nhanVien.showTasks();

        Task nhanVienDecorator = new NhanVienDecorator();
        nhanVienDecorator.showTasks();

        Task giamDoc = new GiamDoc();
        giamDoc.showTasks();

        Task giamDocDecorator = new GiamDocDecorator();
        giamDocDecorator.showTasks();

        Task keToan = new KeToan();
        keToan.showTasks();

        Task keToanDecorator = new KeToanDecorator();
        keToanDecorator.showTasks();

        Task phoGiamDoc = new PhoGiamDoc();
        phoGiamDoc.showTasks();
    }
}
