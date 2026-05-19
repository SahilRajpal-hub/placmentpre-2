package LLDs.LLDTheory.LLDesigns.PubSub;

public class NotificationSubscriber implements Subscriber {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void consume(Message message) {
        System.out.println("Consumed: "+ message.getPayload());
    }
}
