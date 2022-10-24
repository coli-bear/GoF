package com.colibear.struct.composite._01;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);
        
        Client client = new Client();
        
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();

        System.out.println("sum = " + sum);
    }

    private void printPrice(Item doranBlade) {
        System.out.println("doranBlade.getPrice() = " + doranBlade.getPrice());
    }
}
