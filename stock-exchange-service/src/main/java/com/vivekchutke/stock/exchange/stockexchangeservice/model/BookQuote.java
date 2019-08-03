package com.vivekchutke.stock.exchange.stockexchangeservice.model;

import java.util.List;

public class BookQuote {

    private Quote quote;

    private SystemEvent systemEvent;

    private List<Trade> trades;

    private List<Asks> asks;

    private List<Bids> bids;

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public SystemEvent getSystemEvent() {
        return systemEvent;
    }

    public void setSystemEvent(SystemEvent systemEvent) {
        this.systemEvent = systemEvent;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }

    public List<Asks> getAsks() {
        return asks;
    }

    public void setAsks(List<Asks> asks) {
        this.asks = asks;
    }

    public List<Bids> getBids() {
        return bids;
    }

    public void setBids(List<Bids> bids) {
        this.bids = bids;
    }

    public BookQuote() {

    }

    public BookQuote(Quote quotes, SystemEvent systemEvent, List<Trade> trades, List<Asks> asks, List<Bids> bids) {
        this.quote = quotes;
        this.systemEvent = systemEvent;
        this.trades = trades;
        this.asks = asks;
        this.bids = bids;
    }

    @Override
    public String toString() {
        return "BookQuote{" +
                "quotes=" + quote +
                ", systemEvents=" + systemEvent +
                ", trades=" + trades +
                ", asks=" + asks +
                ", bids=" + bids +
                '}';
    }
}
