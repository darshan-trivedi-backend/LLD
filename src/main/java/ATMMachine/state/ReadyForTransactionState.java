package ATMMachine.state;

import ATMMachine.DTO.CreateTransactionDTO;
import ATMMachine.apis.BackendAPI;
import ATMMachine.enums.ATMState;
import ATMMachine.models.ATM;
import ATMMachine.models.Card;

public class ReadyForTransactionState implements State{

    private final ATM atm;

    private final BackendAPI backendAPI;

    public ReadyForTransactionState(ATM atm, BackendAPI backendAPI){
        this.atm = atm;
        this.backendAPI = backendAPI;
    }

    @Override
    public int initTransaction() {
        int transactionId = backendAPI.createTransaction(new CreateTransactionDTO(atm.getAtmID()));
        if (transactionId == 0){
            throw new RuntimeException("Transaction could not be created");
        }
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        throw new IllegalStateException("Can't Read Card Details and PIN without inserting card");
    }

    @Override
    public int dispensingCash() {
        throw new IllegalStateException("Can't Dispense cash without reading card details and PIN");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Can't Eject Card without Reading card Details and PIN");
    }

    @Override
    public boolean readCashWithDrawDetails(int transactionId, int amount) {
        throw new IllegalStateException("Can't Read cash withdraw details without reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
