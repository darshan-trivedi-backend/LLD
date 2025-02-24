package ATMMachine.apis;

import ATMMachine.DTO.CreateTransactionDTO;

public class NodeBackendAPI implements BackendAPI{
    // Should be only responsible to connecting to the backend and returning the response
    public int createTransaction(CreateTransactionDTO createTransactionDTO){
        // 1. Validation
        if (createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()){
            throw new IllegalStateException("ATM ID can't be null or empty");
        }

        // 2. Connect to the backend


        // To mimic the backend call let's return a new Rand transaction ID
        return (int) (Math.random() * 100000);
    }
}
