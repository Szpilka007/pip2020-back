package com.pip.chatbot.controller;

import com.pip.chatbot.model.finance.Stock;
import com.pip.chatbot.model.finance.StockApi;
import com.pip.chatbot.service.fortune.StockService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/stocks")
public class StockController {
    private final StockService stockService;
    private final ModelMapper modelMapper;

    @GetMapping("/{symbol}")
    public ResponseEntity<Stock> getStockForDay(@PathVariable String symbol, @RequestParam Optional<String> dateParam) {
        return ResponseEntity
                .ok()
                .body(modelMapper.map(stockService.getForDay(symbol,
                        dateParam.map(s -> LocalDate.parse(s).atStartOfDay())
                                .orElseGet(LocalDateTime::now)), Stock.class));
    }

    @GetMapping("/period/{symbol}")
    public ResponseEntity<List<Stock>> getStocksForPeriod(@PathVariable String symbol, @RequestParam String startDateParam, @RequestParam Optional<String> endDateParam) {
        return ResponseEntity
                .ok()
                .body(stockService.getForPeriod(symbol, LocalDate.parse(startDateParam).atStartOfDay(),  endDateParam.map(s ->
                        LocalDate.parse(s).atStartOfDay())
                        .orElseGet(LocalDateTime::now)));
    }

    @GetMapping("/prediction/{symbol}")
    public ResponseEntity<List<Stock>> getPredictedForDays(@PathVariable String symbol) {
        return ResponseEntity
                .ok()
                .body(stockService.getPredictedForDays(symbol));
    }
}
