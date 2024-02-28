package ru.titov.kafkaconsumer.config.deserializer;

import com.google.gson.Gson;
import org.apache.kafka.common.serialization.Deserializer;
import ru.titov.kafkaconsumer.domain.IncomingMessage;

public class IncomingMessageDeserializer implements Deserializer<IncomingMessage> {

    private Gson gson = new Gson();

    @Override
    public IncomingMessage deserialize(String s, byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        String string = new String(bytes);
        System.out.println("--");
        System.out.println(string);
        System.out.println("--");
        return gson.fromJson(new String(bytes), IncomingMessage.class);
    }
}
