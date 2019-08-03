package com.vivekchutke.stock.exchange.stockexchangeservice.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

//@XmlRootElement
public class OpenClose {

    private BigDecimal price;

    private Long time;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public OpenClose(BigDecimal price, Long time) {
        this.price = price;
        this.time = time;
    }

    @Override
    public String toString() {
        return "OpenClose{" +
                "price=" + price +
                ", time=" + time +
                '}';
    }

    public OpenClose() {

    }
}
