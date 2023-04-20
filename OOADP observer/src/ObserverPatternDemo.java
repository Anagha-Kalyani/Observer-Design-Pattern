import java.util.HashMap;

public class ObserverPatternDemo { //main class
   public static void main(String[] args) {
      NewsLetter subject = new NewsLetter();

      new Subscriber1(subject);
      new Subscriber2(subject);
      new Subscriber3(subject);

      HashMap<String,String> s1=new HashMap<>() {{
    	  put("Current Affairs","Karnatake elections on 10th May 2023.");
    	  put("Lifestyle","Bubble tea brand Twisty introduces Boba Cheese Jars.");
      }};
      System.out.println("First state change:\n");	
      subject.setState(s1);
      
      System.out.println();
      System.out.println("---------------------------------------------------------------");
      System.out.println();
      
      HashMap<String,String> s2=new HashMap<>() {{
    	  put("Sports","RCB won by 23 runs against DC.");
    	  put("Lifestyle","Rhea Kapoor shares a sneak peak from the sets of The Crew.");
      }};
      System.out.println("Second state change:\n");	
      subject.setState(s2);
   }
}