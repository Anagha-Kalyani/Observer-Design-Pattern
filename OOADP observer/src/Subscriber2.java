import java.util.HashMap;

public class Subscriber2 extends Subscriber{
	//subscriber 2 is interested in lifestyle updates
   public Subscriber2(NewsLetter subject){
      this.subject = subject;
      this.subject.attach(this); //subscriber added to array list
   }

   @Override
   public void update(HashMap state) {
	   String x=(String) state.get("Lifestyle");
	   if (x!=null) {
		   System.out.println("Subscriber2 reads Lifestyle:");
		   System.out.println(x);
		   System.out.println();

	   }
   }
}