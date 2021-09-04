
public class Main 
{
    public static void main(String[] args) 
    {
        MessageSubscriiberone s1 = new MessageSubscriiberone();
        MessageSubscriiberTwo s2 = new MessageSubscriiberTwo();
        MessageSubscriiberThree s3 = new MessageSubscriiberThree();
         
        MessagePublisher q = new MessagePublisher();
         
        q.attach(s1);
        q.attach(s2);
         
        q.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
         
        q.detach(s1);
        q.attach(s3);
         
        q.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}