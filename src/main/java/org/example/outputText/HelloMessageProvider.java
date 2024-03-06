package org.example.outputText;

import org.springframework.stereotype.Component;

@Component
public class HelloMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
