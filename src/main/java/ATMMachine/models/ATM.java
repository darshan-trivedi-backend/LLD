package ATMMachine.models;

import lombok.Getter;

@Getter
public class ATM {
    private final String atmID;

    public ATM(String atmID){
        this.atmID = atmID;
    }
}
