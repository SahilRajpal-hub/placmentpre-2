package LLDs.LLDTheory.LLDesigns.PubSub;

import java.util.Map;

public class PubSubBroker {

    private Map<String, Topic> topics;

    public void createTopic(String topicName) {
        topics.put(topicName,new Topic(topicName));
    }

    public void publish(String topicName,Message message) {
        Topic topic = topics.get(topicName);
        topic.getMessages().offer(message);
        dispatchMessage(topic,message);
    }

    private void dispatchMessage(Topic topic,Message message) {
        for(Subscriber subscriber: topic.getSubscribers()) {
            subscriber.consume(message);
        }
    }
}

/*
    Current implementation is synchronous.

    Problem: one slow subscriber blocks everyone

    Better Design → Async Dispatch
    Use thread pool.
    ExecutorService executor = Executors.newFixedThreadPool(10);
    Then:
    executor.submit(() -> {
        subscriber.consume(message);
    });


*/
