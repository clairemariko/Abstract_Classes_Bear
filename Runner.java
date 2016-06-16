
import java.util.ArrayList;


public class Runner {
  
  public static void main (String[] args){
    // GrizzlyBear yogi = new GrizzlyBear();
    GrizzlyBear frank = new GrizzlyBear();
    PolarBear popo = new PolarBear();

   

    ArrayList<Bear> colony = new ArrayList<Bear>();
    // colony.add(yogi);
    colony.add(frank);
    colony.add(popo);
   


//this is important! we cant do GrizzlyBear as the arraylist is Bear and therefore everything inside it , it sees it as Bear objects. But to use the obj GrizzlyBear we need to now then cast it so it recognises it. 
    GrizzlyBear firstBear = (GrizzlyBear)colony.get(0);
    firstBear.roar();

//enhanced loop
    for (Bear bear : colony){
     System.out.println("bear: " + colony.indexOf(bear));
     bear.typicalDay();
     System.out.println();
    }
  }
}