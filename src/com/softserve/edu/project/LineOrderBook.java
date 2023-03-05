package com.softserve.edu.project;

public class LineOrderBook {
    public static final char upDate = 'u';
    public static final char querie = 'q';
    public static final char order = 'o';
    private char type;//u;q;o;
    private int price;
    private int size;
    private SubType subType;//best_bid, best_ask, buy, sell, bid, ask

    public LineOrderBook(String wholeString) {
        StringBuilder str = new StringBuilder(wholeString + ',');

        //1
        type = getFirstSubString(str, ",").charAt(0);

        //2
        switch (type) {
            case upDate:
                price = strToInt(getFirstSubString(str, ","));
                break;
            case querie:
                subType = SubType.stringToSubType(getFirstSubString(str, ","));
                if (subType == SubType.BEST_BID || subType == SubType.BEST_ASK)
                    return;
                break;
            case order:
                subType = SubType.stringToSubType(getFirstSubString(str, ","));
                break;
            default:
                return;
        }

        //3
        switch (type) {
            case upDate:
                size = strToInt(getFirstSubString(str, ","));
                break;
            case querie:
                price = strToInt(getFirstSubString(str, ","));
                return;
            case order:
                size = strToInt(getFirstSubString(str, ","));
                return;
            default:
                return;
        }

        //4
        switch (type) {
            case upDate:
                subType = SubType.stringToSubType(getFirstSubString(str, ","));
                break;
            default:
                return;
        }
    }

    public char getType() {
        return type;
    }

    public SubType getSubType() {
        return subType;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public int strToInt(String str) {
        try {
            return Integer.parseInt(str.trim());
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            return 0;
        }
    }

    static public String getFirstSubString(StringBuilder curStr, String divider) {
        int firstIndOfDiv = curStr.indexOf(divider);
        String rez = curStr.substring(0, firstIndOfDiv);
        String temp = curStr.substring(firstIndOfDiv + 1, curStr.length());
        curStr.setLength(0);
        curStr.append(temp);
        return rez;
    }
}
