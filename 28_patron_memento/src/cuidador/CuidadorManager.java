package cuidador;

import java.util.Stack;

import memento.UserProfileSnapshot;

public class CuidadorManager {
    private final Stack<UserProfileSnapshot> historial = new Stack<>();
    public void guardar(UserProfileSnapshot snapshot) {
        historial.push(snapshot);
    }
    public UserProfileSnapshot deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}

