 
public class MessageSubscriiberThree implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessagesSubscriiberOne :: " + m.getMessageContent());
    }
}