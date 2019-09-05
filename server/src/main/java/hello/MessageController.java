package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class MessageController {

    // private int id;
    // private String name;
    // private double price;

    @MessageMapping("/message")
    @SendTo("/outbound/message")
    public Message message(GroceryMessage message) throws Exception {
        // Thread.sleep(1000); // simulated delay

        // this.id = message.getId();
        // this.name = message.getName();
        // this.price = message.getPrice();

        return new Message(message);
    }

}
