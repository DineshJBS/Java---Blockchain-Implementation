package com.blockchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateBlockHash {
    Transaction transaction;
    public GenerateBlockHash(Transaction transaction) {
        this.transaction = transaction;
    }

    public  String getHashForBlock(Transaction transaction){
        String originalString =
                transaction.getSourceName() + transaction.getDestinationName() + transaction.getAmount();

        StringBuilder hexString = new StringBuilder();
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            byte[] encodedHash = messageDigest.digest(originalString.getBytes(StandardCharsets.UTF_8));

            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
        }catch(RuntimeException | NoSuchAlgorithmException exe){
            exe.printStackTrace();
        }
        return hexString.toString();
    }
}
