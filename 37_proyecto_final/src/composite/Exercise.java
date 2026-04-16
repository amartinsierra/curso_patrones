package composite;

public class Exercise implements ModuleComponent {
    private String title;

    public Exercise(String title) {
        this.title = title;
    }

    @Override
    public void showInfo() {
        System.out.println("Exercise: " + title);
    }
}

