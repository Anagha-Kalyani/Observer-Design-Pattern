import java.util.HashMap;

public class Subscriber1 extends Subscriber{
//subscriber 1 is interested in sports news
   public Subscriber1(NewsLetter subject){
      this.subject = subject;
      this.subject.attach(this); //subscriber added to array list
   }

   @Override
   public void update(HashMap state) {
	   String x=(String) state.get("Sports");
	   if (x!=null) {
		   System.out.println("Subscriber1 reads Sports:");
		   System.out.println(x);
		   System.out.println();
	   }
   }
}