package LLDs.LLDTheory.LLDesigns.PubSub;

/*
    Publisher delegates responsibility to broker.Good separation of concerns.
*/
public class Publisher {

    private String publisherId;

    private PubSubBroker broker;

    public void publish(String topicName,Message message) {
        broker.publish(topicName,message);
    }
}
