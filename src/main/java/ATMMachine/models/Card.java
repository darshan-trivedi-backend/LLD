package ATMMachine.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Card {
    private final long cardNumber;
    private final int pin;
    private final String name;
    private final String cardType;
    private final String bankName;
}
