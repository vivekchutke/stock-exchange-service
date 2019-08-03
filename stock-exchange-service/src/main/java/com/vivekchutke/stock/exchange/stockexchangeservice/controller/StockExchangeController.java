package com.vivekchutke.stock.exchange.stockexchangeservice.controller;

import com.vivekchutke.stock.exchange.stockexchangeservice.model.OpenHighLowClose;
import com.vivekchutke.stock.exchange.stockexchangeservice.stockexchangeproxy.StockExchangeProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@Configuration
public class StockExchangeController {

    Logger logger = LoggerFactory.getLogger(StockExchangeController.class);

    @Value("${stock-exchange-service.xRapidAPIHost}")
    private String xRapidAPIHost;

    @Value("${stock-exchange-service.xRapidAPIKey}")
    private String xRapidAPIKey;

    @Autowired
    private StockExchangeProxy stockExchangeProxy;

    @GetMapping("/say")
    public String sayHello() {
        return "Hello Buddy";
    }

    @GetMapping("/ohlc/{stockCode}")
    public OpenHighLowClose getOHLC(@PathVariable String stockCode) {

        logger.info("In getOHLC Method with stock code"+stockCode);
        Map<String, String> uriVariables = new HashMap<String, String>();
        uriVariables.put("stockCode", stockCode);

//        ResponseEntity<OpenHighLowClose> responseEntity = new RestTemplate().getForEntity("https://investors-exchange-iex-trading.p.rapidapi.com/stock/{symbol}/ohlc",
//                OpenHighLowClose.class, uriVariables);

        ResponseEntity<OpenHighLowClose> responseEntity = new RestTemplate().exchange("https://investors-exchange-iex-trading.p.rapidapi.com/stock/{stockCode}/ohlc",
                HttpMethod.GET, getHeaderEntity(), OpenHighLowClose.class, uriVariables);


        System.out.println("Response Entity is: "+responseEntity.getBody());

        return responseEntity.getBody();

    }

    @GetMapping("/ohlc-feign/{stockCode}")
    public OpenHighLowClose getOHLCThroughFeign(@PathVariable String stockCode) {
        logger.info("***********In getOHLCThroughFeign Method with stock code" + stockCode);

        String headerValue1="investors-exchange-iex-trading.p.rapidapi.com";
        String headerValue2="6ed3ce8a0bmsh355823103be907cp1c8806jsnc31bc96c5dce";

        OpenHighLowClose openHighLowClose = stockExchangeProxy.retrieveOHLC(stockCode, headerValue1, headerValue2);
        System.out.println("Response Object is****: "+openHighLowClose);

        return openHighLowClose;
    }


    private static HttpEntity<String> getHeaderEntity() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-RapidAPI-Host", "investors-exchange-iex-trading.p.rapidapi.com");
        httpHeaders.add("X-RapidAPI-Key", "6ed3ce8a0bmsh355823103be907cp1c8806jsnc31bc96c5dce");

        return new HttpEntity<String>(httpHeaders);
    }

}
