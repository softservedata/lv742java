package com.softserve.edu.project;

public enum SubType {
    //best_bid, best_ask, buy, sell, bid, ask
    BEST_BID("Best bid"),
    BEST_ASK("Best ask"),
    BUY("Buy"),
    SELL("Sell"),
    BID("Bid"),
    ASK("Ask"),
    SIZE("Size");

    private String name;

    private SubType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static SubType stringToSubType(String s) {
        if (s.compareTo("best_bid") == 0) {
            return BEST_BID;
        } else if (s.compareTo("best_ask") == 0) {
            return BEST_ASK;
        } else if (s.compareTo("buy") == 0) {
            return BUY;
        } else if (s.compareTo("sell") == 0) {
            return SELL;
        } else if (s.compareTo("bid") == 0) {
            return BID;
        } else if (s.compareTo("ask") == 0) {
            return ASK;
        } else if (s.compareTo("size") == 0) {
            return SIZE;
        }
        return null;
    }
}
