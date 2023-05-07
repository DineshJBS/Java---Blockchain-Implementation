package com.blockchain;


public class Block {
    private String previousHash;
    private String currentHash;
    private Transaction transaction;
    public Block(String previousHash, String currentHash, Transaction transaction) {
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.currentHash = currentHash;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public void setCurrentHash(String currentHash) {
        this.currentHash = currentHash;
    }
    public String getPreviousHash() {
        return previousHash;
    }
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public Transaction getTransactions() {
        return transaction;
    }

    public void setTransactions(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Block{" +
                "previousHash='" + previousHash + '\'' +
                ", currentHash='" + currentHash + '\'' +
                ", transaction=" + transaction.toString() +
                '}';
    }
}
