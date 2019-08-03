package com.vivekchutke.stock.exchange.stockexchangeservice.model;

public class Trade {

    private Float price; //":43.415
    private Float size; //:53
    private Float tradeId; //":1527065854
    private Boolean isISO; //":false
    private Boolean isOddLot; //":true
    private Boolean isOutsideRegularHours; //":false
    private Boolean isSinglePriceCross; //":false
    private Boolean isTradeThroughExempt; //":false
    private Long timestamp; //":1559591994402

    public Trade() {

    }

    public Trade(Float price, Float size, Float tradeId, Boolean isISO, Boolean isOddLot,
                 Boolean isOutsideRegularHours, Boolean isSinglePriceCross, Boolean isTradeThroughExempt, Long timestamp) {
        this.price = price;
        this.size = size;
        this.tradeId = tradeId;
        this.isISO = isISO;
        this.isOddLot = isOddLot;
        this.isOutsideRegularHours = isOutsideRegularHours;
        this.isSinglePriceCross = isSinglePriceCross;
        this.isTradeThroughExempt = isTradeThroughExempt;
        this.timestamp = timestamp;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getTradeId() {
        return tradeId;
    }

    public void setTradeId(Float tradeId) {
        this.tradeId = tradeId;
    }

    public Boolean getISO() {
        return isISO;
    }

    public void setISO(Boolean ISO) {
        isISO = ISO;
    }

    public Boolean getOddLot() {
        return isOddLot;
    }

    public void setOddLot(Boolean oddLot) {
        isOddLot = oddLot;
    }

    public Boolean getOutsideRegularHours() {
        return isOutsideRegularHours;
    }

    public void setOutsideRegularHours(Boolean outsideRegularHours) {
        isOutsideRegularHours = outsideRegularHours;
    }

    public Boolean getSinglePriceCross() {
        return isSinglePriceCross;
    }

    public void setSinglePriceCross(Boolean singlePriceCross) {
        isSinglePriceCross = singlePriceCross;
    }

    public Boolean getTradeThroughExempt() {
        return isTradeThroughExempt;
    }

    public void setTradeThroughExempt(Boolean tradeThroughExempt) {
        isTradeThroughExempt = tradeThroughExempt;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "price=" + price +
                ", size=" + size +
                ", tradeId=" + tradeId +
                ", isISO=" + isISO +
                ", isOddLot=" + isOddLot +
                ", isOutsideRegularHours=" + isOutsideRegularHours +
                ", isSinglePriceCross=" + isSinglePriceCross +
                ", isTradeThroughExempt=" + isTradeThroughExempt +
                ", timestamp=" + timestamp +
                '}';
    }
}
