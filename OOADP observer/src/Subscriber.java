import java.util.HashMap;

public abstract class Subscriber {  //observer abstract class
   protected NewsLetter subject;
   public abstract void update(HashMap state);
}