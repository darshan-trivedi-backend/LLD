package ATMMachine.state;

import ATMMachine.enums.ATMState;
import ATMMachine.models.Card;

public interface State {
    int initTransaction();
    boolean readCardDetailsAndPin(Card card);
    int dispensingCash();
    void ejectCard();
    boolean readCashWithDrawDetails(int transactionId, int amount);
    ATMState getState();
}
