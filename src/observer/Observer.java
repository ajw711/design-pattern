package observer;

public class Observer {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/path/file.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("test@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
