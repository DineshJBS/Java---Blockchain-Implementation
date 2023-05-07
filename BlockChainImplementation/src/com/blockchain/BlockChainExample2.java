package com.blockchain;
public class BlockChainExample2 {
    private static String genesishash = "bd30353fb71080e7e5e1fe4f232061fa42a8ff";
    public static void main(String[] args){
        // Creating transactions to for the blocks
        Transaction transaction1 = new Transaction("Scooby", "Tom", 300L);
        Transaction transaction2 = new Transaction("Tom", "Jerry", 200L);
        Transaction transaction3 = new Transaction("Jerry", "Spike", 300L);

        // adding previous Block's Hash, current Block's Hash and transactions to the Block
        Block firstBlock = new Block(genesishash, new GenerateBlockHash(transaction1).getHashForBlock(transaction1), transaction1);
        Block secondBlock = new Block(firstBlock.getPreviousHash(), new GenerateBlockHash(transaction2).getHashForBlock(transaction2), transaction2);
        Block thirdBlock = new Block(secondBlock.getPreviousHash(), new GenerateBlockHash(transaction3).getHashForBlock(transaction3), transaction3);

        // This is the Hash for the Second Block
        String originalHashForSecondBlock = new GenerateBlockHash(transaction2).getHashForBlock(transaction2);

        // now the SourceName transaction in SecondBlock is modified So it would have generated a new hash for secondBlock
        transaction2.setSourceName("Spoonge Bob");
        String newHashForSecondBlock = new GenerateBlockHash(transaction2).getHashForBlock(transaction2);

        // Checking if the Hash is changed after modification
        if(!originalHashForSecondBlock.equals(newHashForSecondBlock)){
            System.out.println("A modification occurred as the hashCode is different");
        }else{
            System.out.println("No modification occurred");
        }
    }
}
