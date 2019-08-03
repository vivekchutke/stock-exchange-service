package com.vivekchutke.stock.exchange.stockexchangeservice.model;

public class SystemEvent {

    private String systemEvent; //":"C"
    private String timestamp; //":1559596200000

    public SystemEvent(String systemEvent, String timestamp) {
        this.systemEvent = systemEvent;
        this.timestamp = timestamp;
    }

    public String getSystemEvent() {
        return systemEvent;
    }

    public void setSystemEvent(String systemEvent) {
        this.systemEvent = systemEvent;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SystemEvent{" +
                "systemEvent='" + systemEvent + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public SystemEvent() {

    }
}
