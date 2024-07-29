package limhs.webex_attendance.domain;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "STUDENT")
public class Student {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;
}
