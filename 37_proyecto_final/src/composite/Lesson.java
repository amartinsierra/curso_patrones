package composite;

public class Lesson implements ModuleComponent {
    private String title;

    public Lesson(String title) {
        this.title = title;
    }

    @Override
    public void showInfo() {
        System.out.println("Lesson: " + title);
    }
}
