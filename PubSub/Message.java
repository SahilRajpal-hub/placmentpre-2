package LLDs.LLDTheory.LLDesigns.PubSub;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

    private String messageId;

    private String payload;

    private LocalDateTime createdAt;

    public Message(String payload) {

        this.messageId = UUID.randomUUID().toString();

        this.payload = payload;

        this.createdAt = LocalDateTime.now();
    }

    public String getPayload() {
        return payload;
    }
}