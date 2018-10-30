import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class Runner
{

    /**
     * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
     */
    public static void main(String[] args)
    {
        Bot1 chatbot1 = new Bot1();
        Bot2 chatbot2 = new Bot2();
        Bot3 chatbot3 = new Bot3();


        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to the chatbot, nice to meet you.");
        String statement = in.nextLine();


        while (!statement.equals("Bye"))
        {
            //Use Logic to control which chatbot is handling the conversation\
            //This example has only chatbot1



            chatbot1.chatLoop(statement);


            statement = in.nextLine();


        }
    }

}
