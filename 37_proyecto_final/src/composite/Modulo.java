package composite;

import java.util.ArrayList;
import java.util.List;

public class Modulo implements ModuleComponent {
    private String title;
    private List<ModuleComponent> components = new ArrayList<>();

    public Modulo(String title) {
        this.title = title;
    }

    public void add(ModuleComponent component) {
        components.add(component);
    }

    public void remove(ModuleComponent component) {
        components.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Module: " + title);
        for (ModuleComponent component : components) {
            component.showInfo();
        }
    }
}

