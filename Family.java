import java.util.Random;
import javax.swing.JOptionPane;

public class Family {
    
    int Income = 0;
    int children = 0;
    static int randomInt = 0;
    
    static {  
        Random rdm = new Random();
        randomInt = rdm.nextInt(7) + 1;
    }
    
    
    {
        children = randomInt;
    
    }
    Family() {
        
        Income = randomInt * 1000;
    }
    
    Family(int num) {
        String userInput;
        double numDouble;
        userInput = JOptionPane.showInputDialog("\n Input your income : ");
        
        Double varDouble = new Double(userInput);
        numDouble = varDouble.doubleValue();
        
        System.out.println("Double, " +varDouble);
    }
    
    public static void main (String []args) {
        
     
        if (randomInt < 4) { 
            Family obj1 = new Family();
        }
        else {
            Family obj2 = new Family(randomInt);
        }
        

    }
        
}

