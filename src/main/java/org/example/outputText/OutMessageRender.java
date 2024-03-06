package org.example.outputText;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OutMessageRender implements MessageRender{
    MessageProvider provider;

    @Override
    public void render() {
            if(provider == null){
                System.out.println("Erro");
            }else{
                System.out.println(provider.getMessage());
            }
    }

    @Autowired
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
