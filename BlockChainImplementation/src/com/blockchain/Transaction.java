package com.blockchain;

public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long amount;

    public Transaction(String sourceName, String destinationName, Long amount) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.amount = amount;
    }


    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceName='" + sourceName + '\'' +
                ", destinationName='" + destinationName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
