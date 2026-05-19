package LLDs.LLDTheory.LLDesigns.PubSub;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Topic {

    private String topicName;

    private List<Subscriber> subscribers;

    private Queue<Message> messages;

    public Topic(String topicName) {
        this.topicName = topicName;
        subscribers = new ArrayList<>();

        // Because: multiple publishers, multiple dispatcher threads
        messages = new ConcurrentLinkedQueue<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public String getTopicName() {
        return topicName;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public Queue<Message> getMessages() {
        return messages;
    }

    
}
