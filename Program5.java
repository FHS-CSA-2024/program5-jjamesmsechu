//import stuff here?

//Your code here
import java.text.DecimalFormat;

public class Program5{
    public static void main(String[] args ){
        DecimalFormat df = new DecimalFormat("#.0");
        String royale = df.format(286/9d);
        String koopaKing = df.format(412/40d);
        String pipeFrame = df.format(361/18d);
        String badWagon = df.format(161/11d);
        System.out.println("\nMushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println("\nRoyale averaged " + royale + " m/g");
        System.out.println("\nKoopa King averaged " + koopaKing + " m/g");
        System.out.println("\nPipe Frame averaged " + pipeFrame + " m/g");
        System.out.println("\nBadwagon averaged " + badWagon + " m/g");
        }
}


//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon: 

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g
*/
