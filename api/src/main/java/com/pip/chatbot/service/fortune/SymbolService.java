package com.pip.chatbot.service.fortune;

import com.pip.chatbot.exception.ChatbotExceptionBuilder;
import com.pip.chatbot.exception.messages.CitiesErrorMessages;
import com.pip.chatbot.exception.messages.StockErrorMessages;
import com.pip.chatbot.model.fortune.Symbol;
import com.pip.chatbot.repository.fortune.CurrencyRepository;
import com.pip.chatbot.repository.fortune.SymbolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SymbolService {
    private final SymbolRepository symbolRepository;

    public Symbol createSymbol(Symbol symbol){
        return symbolRepository.createSymbol(symbol);
    }

    public Symbol updateSymbol(Symbol symbol){
        return symbolRepository.updateSymbol(symbol)
                .orElseThrow(() -> new ChatbotExceptionBuilder().addError(StockErrorMessages.SYMBOL_NOT_FOUND).build());
    }

    public List<Symbol> getAllCompanies(){
        return symbolRepository.getAllCompanies();
    }
}
