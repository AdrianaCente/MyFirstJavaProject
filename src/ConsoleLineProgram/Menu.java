package ConsoleLineProgram;

public class Menu {
    public int id = 0;
    public String title;
    public String methodName;
    public Menu(int id, String title, String methodName) {
        this.id = id;
        this.title = title;
        this.methodName = methodName;
    }
    public Menu(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public void showMenu() {
        System.out.println(id + ". " + title);
    }
}
