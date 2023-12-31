package AlexBabiyKI307;

import java.io.PrintWriter;
/**
 *  Class Mouth
 *  @version 1.0
 */
public class Mouth {
    private String name;
    PrintWriter fout;
    /**
     *  Constructor
     *  @param name person name
     *  @param fout PrintWriter
     */
    public Mouth(PrintWriter fout, String name)
    {
        this.name = name;
        this.fout = fout;
    }
    /**
     *  Method to say something
     */
    public void say(String message)
    {
        String output = name + " says: " + message; System.out.println(output); fout.println(output);
    }
}
