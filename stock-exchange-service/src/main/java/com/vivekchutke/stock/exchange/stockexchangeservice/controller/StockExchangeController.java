package com.vivekchutke.stock.exchange.stockexchangeservice.controller;

import com.vivekchutke.stock.exchange.stockexchangeservice.model.BookQuote;
import com.vivekchutke.stock.exchange.stockexchangeservice.model.OpenHighLowClose;
import com.vivekchutke.stock.exchange.stockexchangeservice.stockexchangeproxy.StockExchangeProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@Component
public class StockExchangeController {

    Logger logger = LoggerFactory.getLogger(StockExchangeController.class);

    @Value("${stock-exchange-service.xRapidAPIHost}")
    private String xRapidAPIHost;

    @Value("${stock-exchange-service.xRapidAPIKey}")
    private String xRapidAPIKey;

    @Autowired
    private StockExchangeProxy stockExchangeProxy;

    @Autowired
    private Environment environment;


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

//        String headerValue1="investors-exchange-iex-trading.p.rapidapi.com";
//        String headerValue2="6ed3ce8a0bmsh355823103be907cp1c8806jsnc31bc96c5dce";

        OpenHighLowClose openHighLowClose = stockExchangeProxy.retrieveOHLC(stockCode, this.xRapidAPIHost, this.xRapidAPIKey);
        System.out.println("Response Object is****: "+openHighLowClose);

        return openHighLowClose;
    }

    @RequestMapping(value = "/stock/{stockCode}/book", method = RequestMethod.GET)
    public BookQuote getBookQuote(@PathVariable String stockCode) {
        logger.info("*******In getBookQuote Method with stock code: "+stockCode);
        Map<String, String> uriVariables = new HashMap<String, String>();
        uriVariables.put("stockCode", stockCode);
        ResponseEntity<BookQuote> responseEntity = new RestTemplate().exchange("https://investors-exchange-iex-trading.p.rapidapi.com/stock/{stockCode}/book",
                HttpMethod.GET, this.getHeaderEntity(), BookQuote.class, uriVariables);
        System.out.println("Printing ResponseBody:" +responseEntity.getBody());

        BookQuote bookQuote = responseEntity.getBody();
        String port = environment.getProperty("local.server.port");
//        logger.info("******* Port Value is: "+port);
//        logger.info("*******environmen values:"+environment.getProperty("spring.security.user.name"));
//        logger.info("*******environmen values:"+environment.getProperty("spring.security.user.name"));
//        logger.info("*******VCAP_APPLICATION.application_id values:"+environment.getProperty("VCAP_APPLICATION.application_id"));
//        logger.info("*******VCAP_APPLICATION values:"+environment.getProperty("VCAP_APPLICATION"));
//        logger.info("*******EnvVarKey values:"+environment.getProperty("EnvVarKey"));
        bookQuote.setPort(port);
        return bookQuote;
    }

    private  HttpEntity<String> getHeaderEntity() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-RapidAPI-Host", this.xRapidAPIHost);
        httpHeaders.add("X-RapidAPI-Key", this.xRapidAPIKey);
        logger.info("Header Key X-RapidAPI-Host is :"+this.xRapidAPIHost);
        logger.info("Header Key X-RapidAPI-Key is :"+this.xRapidAPIKey);

        return new HttpEntity<String>(httpHeaders);
    }
}
