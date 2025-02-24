package ATMMachine.apis;

import ATMMachine.DTO.CreateTransactionDTO;

public interface BackendAPI {
    int createTransaction(CreateTransactionDTO createTransactionDTO);
}
