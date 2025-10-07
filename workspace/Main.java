//This file contains an example of how to read user input. Use this in conjunction with your linked list class to test your program.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args)
        throws IOException
    {
      testA();
      //testD();
      //testC();
      //testR();
      testRN();
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        LinkedList list = new LinkedList();
        String input= reader.readLine();
        while(!input.equals("exit"))
        {
          if(input.length()>3 && input.substring(0, 3).equals("add"))
          {
            System.out.println(list.addAValue(input.substring(4)).getValue());
          }
          else if(input.equals("show"))
          {
            System.out.println(list.showValues());
          }
          else if(input.length() > 7 && input.substring(0, 6).equals("remove")){
              System.out.println("removing "+input.substring(7));
              System.out.println(list.deleteAValue(input.substring(7)).getValue());
          }
          else if(input.equals("clear"))
          {
            list.clear();
          }
           else if(input.equals("reverse"))
          {
            list.reverse();
          }
          else if(input.contains("nrev"))
          {
           System.out.println("got "+ list.reverseN(Integer.parseInt(input.substring(5))));
          }
          else if(!input.equals("exit")){
              System.out.println("I don't know how to "+input);
          }
          input= reader.readLine();
        }
 
        // Printing the read line
        System.out.println("thanks for playing!");


    }

    public static void testA (){
         LinkedList tester = new LinkedList();
         tester.addAValue("Alpha");
         tester.addAValue("Beta");
         tester.addAValue("Gamma");
         tester.addAValue("Delta");
         tester.addAValue("Epsilon");
         tester.addAValue("Zeta");
         tester.addAValue("Eta");

        System.out.println(tester.showValues());

    }
    public static void testD (){
      LinkedList tester = new LinkedList();
         tester.addAValue("Alpha");
         tester.addAValue("Beta");
         tester.addAValue("Gamma");
         tester.addAValue("Delta");
         tester.deleteAValue("Beta");
          tester.deleteAValue("Alpha");
        System.out.println(tester.showValues());

    }
    public  static void testC (){
          LinkedList tester = new LinkedList();
         tester.addAValue("Alpha");
         tester.addAValue("Beta");
         tester.addAValue("Gamma");
         tester.addAValue("Delta");
         tester.clear();
        System.out.println(tester.showValues());

    }

    public static void testR (){
       LinkedList tester = new LinkedList();
     tester.addAValue("Alpha");
         tester.addAValue("Beta");
         tester.addAValue("Gamma");
         tester.addAValue("Delta");
         tester.addAValue("Epsilon");
         tester.addAValue("Zeta");
         tester.addAValue("Eta");
         tester.reverse();
         System.out.println(tester.showValues());
      
    }
    public static void testRN (){
       LinkedList tester = new LinkedList();
     tester.addAValue("Alpha");
         tester.addAValue("Beta");
         tester.addAValue("Gamma");
         tester.addAValue("Delta");
         tester.addAValue("Epsilon");
         tester.addAValue("Zeta");
         tester.addAValue("Eta");
         tester.reverseN(2);
         System.out.println(tester.showValues());
      
    }
}
