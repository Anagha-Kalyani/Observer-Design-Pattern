import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NewsLetter { //subject
	
   private List<Subscriber> subscribers = new ArrayList<Subscriber>(); //array list of subscribers to the news letter
   private HashMap<String,String> state; 
   
   public HashMap getState() { //returns the current state
      return state;
   }

   public void setState(HashMap state) { //when there is a change of state ie release, it notifies observers
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Subscriber subscriber){ //adds subscriber to the array list of subscribers
	   subscribers.add(subscriber);		
   }

   public void notifyAllObservers(){ //notification to all subscribers
      for (Subscriber subscriber : subscribers) {
    	  subscriber.update(state);
      }
   } 	
}