package LLDs.LLDTheory.LLDesigns.FoodDeliverySystem;

import java.util.List;


/*
    Current implementation simplistic.

    Real systems consider:
        distance
        traffic
        batching
        agent rating
        delivery load

    Mention this verbally.

*/

public class NearestAgentStrategy implements DeliveryStrategy {

    @Override
    public DeliveryAgent assignAgent(Order order,List<DeliveryAgent> agents) {

        for(DeliveryAgent agent : agents) {

            if(agent.getStatus()== AgentStatus.AVAILABLE) {

                return agent;
            }
        }

        return null;
    }
}
