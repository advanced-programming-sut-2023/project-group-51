package model;

public class Trade {
    private User hostTrader;
    private User guestTrader;
    private int id;
    private String resource;
    private int amount;
    private int price;
    private String message;

    public Trade(int id, String resource, int amount, int price, String message) {
        this.id = id;
        this.resource = resource;
        this.amount = amount;
        this.price = price;
        this.message = message;
    }
    public Trade(){}
}
