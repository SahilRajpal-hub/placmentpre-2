package LLDs.LLDTheory.LLDesigns.PubSub;


/*
    Using interface allows:
        email subscribers
        analytics consumers
        notification consumers
        logging consumers

*/
public interface Subscriber {

    String getId();

    void consume(Message message);
}
