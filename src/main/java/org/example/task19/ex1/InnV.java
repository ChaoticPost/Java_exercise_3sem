package org.example.task19.ex1;

import java.math.BigInteger;

public class InnV extends Exception {

    private BigInteger innNum;

    public InnV (BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
