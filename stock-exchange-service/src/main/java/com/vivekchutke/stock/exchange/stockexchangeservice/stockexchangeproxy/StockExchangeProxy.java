package com.vivekchutke.stock.exchange.stockexchangeservice.stockexchangeproxy;

import com.vivekchutke.stock.exchange.stockexchangeservice.model.OpenHighLowClose;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="stock-exchange-service", url = "https://investors-exchange-iex-trading.p.rapidapi.com/")
public interface StockExchangeProxy {

    @GetMapping("/stock/{symbol}/ohlc")
    public OpenHighLowClose retrieveOHLC(@PathVariable(name = "symbol") String  symbol, @RequestHeader(name = "X-RapidAPI-Host") String host
            , @RequestHeader(name = "X-RapidAPI-Key") String key);
}
