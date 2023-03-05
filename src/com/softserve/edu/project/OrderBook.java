package com.softserve.edu.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderBook {
    private List<LineOrderBook> list;

    public OrderBook() {
        list = new ArrayList<LineOrderBook>();
    }

    public Optional<LineOrderBook> getBestBidOptional(int index) {
        return list.subList(0, index).
                stream().
                filter(el -> (el.getType() == LineOrderBook.upDate)).
                filter(el -> (el.getSize() > 0)).
                filter(el -> (el.getSubType() == SubType.BID)).
                max((l1, l2) -> (l1.getPrice() - l2.getPrice()));
    }

    /*
     * Знаходимо саму високу ціну по якій покупець готовий купити товар, тобто BID з найкращою ціною
     */
    public String getBestBid(int index) {
        //most expensive ones
        LineOrderBook tempLineOB;
        Optional<LineOrderBook> optional = getBestBidOptional(index);
        if (optional.isPresent()) {
            tempLineOB = optional.get();
            return String.valueOf(tempLineOB.getPrice()) + "," + String.valueOf(tempLineOB.getSize());
        } else {
            return "";
        }
    }

    public Optional<LineOrderBook> getBestAskOptional(int index) {
        return list.subList(0, index).
                stream().
                filter(el -> (el.getType() == LineOrderBook.upDate)).
                filter(el -> (el.getSize() > 0)).
                filter(el -> (el.getSubType() == SubType.ASK)).
                min((l1, l2) -> (l1.getPrice() - l2.getPrice()));
    }

    /*
     * Знаходимо саму низьку ціну по якій продавець готовий продати товар, тобто ASK з найкращою ціною
     */
    public String getBestAsk(int index) {
        //most cheap ones
        LineOrderBook tempLineOB;
        Optional<LineOrderBook> optional = getBestAskOptional(index);
        if (optional.isPresent()) {
            tempLineOB = optional.get();
            return String.valueOf(tempLineOB.getPrice()) + "," + String.valueOf(tempLineOB.getSize());
        } else {
            return "";
        }
    }

    public String getSize(int index) {
        //most cheap ones
        int indexWithPrice = -1;
        int currPrice = list.get(index).getPrice();
        LineOrderBook tempLineOB;
        for (int i = index - 1; i >= 0; i--) {
            tempLineOB = list.get(i);
            if (tempLineOB.getType() == LineOrderBook.upDate && tempLineOB.getPrice() == currPrice) {
                indexWithPrice = i;
                break;
            }
        }

        if (indexWithPrice == -1) return "0";
        tempLineOB = list.get(indexWithPrice);
        return String.valueOf(tempLineOB.getSize());
    }

    /*
     * Проходимося по всім відомим пропозиціям на продаж і купуємо до тих пір поки не купимо все, що потрібно або поки
     * не закінчаться всі пропозиції. Починаємо з дешевщої - працюємо в рекурсії. Робимо апдейт таблиці пропозицій.
     * */
    public void doBuy(int index, int currSize) {
        //most cheap ones
        LineOrderBook tempLineOB;
        Optional<LineOrderBook> optional = getBestAskOptional(index);
        if (optional.isPresent()) {
            tempLineOB = optional.get();
            if (tempLineOB.getSize() >= currSize) {
                tempLineOB.setSize(tempLineOB.getSize() - currSize);
            } else {
                int leftSize = tempLineOB.getSize();
                tempLineOB.setSize(0);
                doBuy(index, currSize - leftSize);
            }
        }
    }

    /*
     * Робимо продаж, щукаємо на ринку покупців які готові купити за вищою ціною і продаємо всім бажаючим до тих пір поки
     * не продамо весь об'єм, або до тих пір поки не закінчаться бажаючі купити. Працюємо через рекурсію.
     * Робимо апдейт таблиці пропозицій.
     * */
    public void doSell(int index, int currSize) {
        //most expensive ones
        LineOrderBook tempLineOB;
        Optional<LineOrderBook> optional = getBestBidOptional(index);
        if (optional.isPresent()) {
            tempLineOB = optional.get();
            if (tempLineOB.getSize() >= currSize) {
                tempLineOB.setSize(tempLineOB.getSize() - currSize);
            } else {
                int leftSize = tempLineOB.getSize();
                tempLineOB.setSize(0);
                doSell(index, currSize - leftSize);
            }
        }
    }

    public String doTheWork(int currIndex) {
        String rez = "";

        LineOrderBook currentLine = list.get(currIndex);
        switch (currentLine.getType()) {
            case LineOrderBook.querie:
                if (currentLine.getSubType() == SubType.BEST_BID) {
                    return getBestBid(currIndex);
                } else if (currentLine.getSubType() == SubType.BEST_ASK) {
                    return getBestAsk(currIndex);
                } else return getSize(currIndex);
            case LineOrderBook.order:
                if (currentLine.getSubType() == SubType.BUY) {
                    doBuy(currIndex, list.get(currIndex).getSize());
                } else doSell(currIndex, list.get(currIndex).getSize());
                break;
            default:
                break;
        }
        return rez;
    }

    public List<String> parseToList() {
        List<String> outList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String currStr = doTheWork(i);
            if (currStr.length() > 0) {
                outList.add(currStr);
            }
        }
        return outList;
    }

    public void parseFromList(List<String> inList) {
        for (String el : inList) {
            LineOrderBook newLineOB = new LineOrderBook(el.trim());
            if (newLineOB.getType() == LineOrderBook.upDate) {
                if (newLineOB.getSize() < 0 || newLineOB.getPrice() <= 0) continue;
            }
            if (newLineOB.getType() == LineOrderBook.order) {
                if (newLineOB.getSize() < 0) continue;
            }
            if (newLineOB.getType() == LineOrderBook.querie && newLineOB.getSubType() == SubType.SIZE) {
                if (newLineOB.getPrice() <= 0) continue;
            }
            list.add(newLineOB);
        }
    }
}
