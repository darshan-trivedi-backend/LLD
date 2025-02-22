package ProtoTypePattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PremiumEmail extends Email{

    private String cc;
    private String bcc;

    public PremiumEmail(String sender, String receiver, String subject, String body, String cc, String  bcc) {
        super(sender, receiver, subject, body);
        this.cc = cc;
        this.bcc = bcc;
    }

    public PremiumEmail(Email email, String cc, String bcc) {
        super(email);
        this.cc = cc;
        this.bcc = bcc;
    }

    public PremiumEmail(PremiumEmail premiumEmail) {
        super(premiumEmail);
        this.cc = premiumEmail.getCc();
        this.bcc = premiumEmail.getBcc();
    }

    @Override
    public PremiumEmail copy(){
        return new PremiumEmail(this);
    }
}
