/**
 * Created by Chris on 6/13/2015.
 */
public class HelloWorld {
    public static void main(String[] args)  {
        int sum = 0;
        for(int i = 0; i < args.length;i++)
            sum += Integer.parseInt(args[i]);
        System.out.println("Result = " + sum);
    }
}
