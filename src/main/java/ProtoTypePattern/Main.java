package ProtoTypePattern;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("root@gmail.com", "hello@gmail.com", "Test Email", "This is a Test email");
        Email copyEmail = new Email(email1);
        System.out.println(copyEmail);
        System.out.println(copyEmail.getBody());

    }
}
