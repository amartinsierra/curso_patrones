package observer;

public class ProgressTracker implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Progress Tracker received: " + message);
    }
}

