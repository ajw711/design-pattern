package observer;

import java.io.File;

public class EmailNotificationListener  implements EventListener {

    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("이메일 발송 [" + email + "]: 누군가 " +
                eventType + " 작업을 다음 파일로 수행함: " + file.getName());
    }


}
