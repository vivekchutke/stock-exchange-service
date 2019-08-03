package com.vivekchutke.stock.exchange.stockexchangeservice.model;

public class Quote {

    private String symbol; //":"INTC"
    private String companyName; //":"Intel Corporation"
    private String primaryExchange; //":"Nasdaq Global Select"
    private String sector; //":"Technology"
    private String calculationPrice; //":"close"
    private Float open; //":44.25
    private Long openTime; //":1559568600804
    private Float close; //; //":43.46
    private Long closeTime; //":1559592000791
    private Float high; //":44.585
    private Float low; //":43.2
    private Float latestPrice; //":43.46
    private String latestSource; //":"Close"
    private String latestTime; //":"June 3, 2019"
    private Long latestUpdate; //":1559592000791
    private Long latestVolume; //":30596054
    private Float iexRealtimePrice; //":43.425
    private Integer iexRealtimeSize; //":53
    private Long iexLastUpdated; //":1559591995193
    private Float delayedPrice; //":43.46
    private Long delayedPriceTime; //":1559592000791
    private Float extendedPrice; //":43.58
    private Float extendedChange; //":0.12
    private Float extendedChangePercent; //":0.00276
    private Long extendedPriceTime; //":1559595481141
    private Float previousClose; //":44.04
    private Float change; //":-0.58
    private Float changePercent; //":-0.01317
    private Float iexMarketPercent; //":0.01926
    private Long iexVolume; //":589280
    private Long avgTotalVolume; //":29190143
    private Integer iexBidPrice; //":0
    private Integer iexBidSize; //":0
    private Integer iexAskPrice; //":0
    private Integer iexAskSize; //":0
    private Long marketCap; //":194570420000
    private Float peRatio; //":9.47
    private Float week52High; //":59.59
    private Float week52Low; //":42.36
    private Float ytdChange; //":-0.06604674709185418

    public Quote(String symbol, String companyName, String primaryExchange, String sector,
                 String calculationPrice, Float open, Long openTime, Float close,
                 Long closeTime, Float high, Float low, Float latestPrice, String latestSource,
                 String latestTime, Long latestUpdate, Long latestVolume, Float iexRealtimePrice,
                 Integer iexRealtimeSize, Long iexLastUpdated, Float delayedPrice, Long delayedPriceTime,
                 Float extendedPrice, Float extendedChange, Float extendedChangePercent,
                 Long extendedPriceTime, Float previousClose, Float change, Float changePercent,
                 Float iexMarketPercent, Long iexVolume, Long avgTotalVolume, Integer iexBidPrice,
                 Integer iexBidSize, Integer iexAskPrice, Integer iexAskSize, Long marketCap,
                 Float peRatio, Float week52High, Float week52Low, Float ytdChange) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.primaryExchange = primaryExchange;
        this.sector = sector;
        this.calculationPrice = calculationPrice;
        this.open = open;
        this.openTime = openTime;
        this.close = close;
        this.closeTime = closeTime;
        this.high = high;
        this.low = low;
        this.latestPrice = latestPrice;
        this.latestSource = latestSource;
        this.latestTime = latestTime;
        this.latestUpdate = latestUpdate;
        this.latestVolume = latestVolume;
        this.iexRealtimePrice = iexRealtimePrice;
        this.iexRealtimeSize = iexRealtimeSize;
        this.iexLastUpdated = iexLastUpdated;
        this.delayedPrice = delayedPrice;
        this.delayedPriceTime = delayedPriceTime;
        this.extendedPrice = extendedPrice;
        this.extendedChange = extendedChange;
        this.extendedChangePercent = extendedChangePercent;
        this.extendedPriceTime = extendedPriceTime;
        this.previousClose = previousClose;
        this.change = change;
        this.changePercent = changePercent;
        this.iexMarketPercent = iexMarketPercent;
        this.iexVolume = iexVolume;
        this.avgTotalVolume = avgTotalVolume;
        this.iexBidPrice = iexBidPrice;
        this.iexBidSize = iexBidSize;
        this.iexAskPrice = iexAskPrice;
        this.iexAskSize = iexAskSize;
        this.marketCap = marketCap;
        this.peRatio = peRatio;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.ytdChange = ytdChange;
    }

    public Quote() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public Float getClose() {
        return close;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Float latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public Long getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(Long latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public Long getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(Long latestVolume) {
        this.latestVolume = latestVolume;
    }

    public Float getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(Float iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public Integer getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(Integer iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public Long getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(Long iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public Float getDelayedPrice() {
        return delayedPrice;
    }

    public void setDelayedPrice(Float delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public Long getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(Long delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public Float getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Float extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public Float getExtendedChange() {
        return extendedChange;
    }

    public void setExtendedChange(Float extendedChange) {
        this.extendedChange = extendedChange;
    }

    public Float getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public void setExtendedChangePercent(Float extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public Long getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(Long extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public Float getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Float previousClose) {
        this.previousClose = previousClose;
    }

    public Float getChange() {
        return change;
    }

    public void setChange(Float change) {
        this.change = change;
    }

    public Float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Float changePercent) {
        this.changePercent = changePercent;
    }

    public Float getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(Float iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public Long getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(Long iexVolume) {
        this.iexVolume = iexVolume;
    }

    public Long getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(Long avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public Integer getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(Integer iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public Integer getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(Integer iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public Integer getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(Integer iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public Integer getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(Integer iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public Float getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Float peRatio) {
        this.peRatio = peRatio;
    }

    public Float getWeek52High() {
        return week52High;
    }

    public void setWeek52High(Float week52High) {
        this.week52High = week52High;
    }

    public Float getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(Float week52Low) {
        this.week52Low = week52Low;
    }

    public Float getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(Float ytdChange) {
        this.ytdChange = ytdChange;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "symbol='" + symbol + '\'' +
                ", companyName='" + companyName + '\'' +
                ", primaryExchange='" + primaryExchange + '\'' +
                ", sector='" + sector + '\'' +
                ", calculationPrice='" + calculationPrice + '\'' +
                ", open=" + open +
                ", openTime=" + openTime +
                ", close=" + close +
                ", closeTime=" + closeTime +
                ", high=" + high +
                ", low=" + low +
                ", latestPrice=" + latestPrice +
                ", latestSource='" + latestSource + '\'' +
                ", latestTime='" + latestTime + '\'' +
                ", latestUpdate=" + latestUpdate +
                ", latestVolume=" + latestVolume +
                ", iexRealtimePrice=" + iexRealtimePrice +
                ", iexRealtimeSize=" + iexRealtimeSize +
                ", iexLastUpdated=" + iexLastUpdated +
                ", delayedPrice=" + delayedPrice +
                ", delayedPriceTime=" + delayedPriceTime +
                ", extendedPrice=" + extendedPrice +
                ", extendedChange=" + extendedChange +
                ", extendedChangePercent=" + extendedChangePercent +
                ", extendedPriceTime=" + extendedPriceTime +
                ", previousClose=" + previousClose +
                ", change=" + change +
                ", changePercent=" + changePercent +
                ", iexMarketPercent=" + iexMarketPercent +
                ", iexVolume=" + iexVolume +
                ", avgTotalVolume=" + avgTotalVolume +
                ", iexBidPrice=" + iexBidPrice +
                ", iexBidSize=" + iexBidSize +
                ", iexAskPrice=" + iexAskPrice +
                ", iexAskSize=" + iexAskSize +
                ", marketCap=" + marketCap +
                ", peRatio=" + peRatio +
                ", week52High=" + week52High +
                ", week52Low=" + week52Low +
                ", ytdChange=" + ytdChange +
                '}';
    }
}
