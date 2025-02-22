package ProtoTypePattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Email implements Prototype<Email> {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Email(String sender, String receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    // This is Violating OCP, if we have child class
    // what if we forget to override copy constructor in child class
    public Email(Email email){
        this.sender = email.sender;
        this.receiver = email.receiver;
        this.subject = email.subject;
        this.body = email.body;
    }

    @Override
    public Email copy() {
        return new Email(this);
    }
}
