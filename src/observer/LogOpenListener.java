package observer;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("로그 저장 [" + log + "]: 누군가 " +
                eventType + " 작업을 다음 파일로 수행함: " + file.getName());
    }
}
