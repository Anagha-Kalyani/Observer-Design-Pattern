import java.util.HashMap;

public class Subscriber3 extends Subscriber{
	//subscriber 3 is interested in  current affairs
   public Subscriber3(NewsLetter subject){
      this.subject = subject;
      this.subject.attach(this); //subscriber added to array list
   }

   @Override
   public void update(HashMap state) {
	   String x=(String) state.get("Current Affairs");
	   if (x!=null) {
		   System.out.println("Subscriber3 reads Current Affairs:");
		   System.out.println(x);
		   System.out.println();

	   }
   }
}