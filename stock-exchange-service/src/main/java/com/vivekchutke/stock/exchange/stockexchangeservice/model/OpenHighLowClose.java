package com.vivekchutke.stock.exchange.stockexchangeservice.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
public class OpenHighLowClose {

    private OpenClose open;

    private OpenClose close;

    private BigDecimal high;

    private BigDecimal low;

    public OpenHighLowClose() {

    }

    public OpenHighLowClose(OpenClose open, OpenClose close, BigDecimal high, BigDecimal low) {
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
    }

    public OpenClose getOpen() {
        return open;
    }

    public void setOpen(OpenClose open) {
        this.open = open;
    }

    public OpenClose getClose() {
        return close;
    }

    public void setClose(OpenClose close) {
        this.close = close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "OpenHighLowClose{" +
                "open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                '}';
    }
}
