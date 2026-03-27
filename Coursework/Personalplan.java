package Coursework;


/**
 * Write a description of class Personalplan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Personalplan extends AIModel
{
    private int promptsRemaining;
    
    public Personalplan(String modelName, double price,String contextWindow, int promptsRemaining)
    {
        super(modelName, price, contextWindow);
        this.promptsRemaining = promptsRemaining;
    }

    public int getPromptsRemaining() {
        return promptsRemaining;
    }

    public String buyPrompts(int amount) {
        if (amount < 0) {
            return "Please enter a positive number, or upgrade to a Pro Plan for unlimited access.";
        }
        promptsRemaining += amount;
        return amount + " prompts added! You now have " + promptsRemaining + " prompts remaining.";
    }

    public String enterPrompt(String promptText, int responseLength) {
        if (promptsRemaining <= 0) {
            return "Monthly prompt limit reached. Please buy more prompts or upgrade to Pro Plan.";
        }
        promptsRemaining--;
        return "Prompt sent successfully!\n"
             + "Prompt   : " + promptText       + "\n"
             + "Tokens   : " + responseLength   + " tokens\n"
             + "Prompts left this month: " + promptsRemaining;
    }

    @Override
    public String display() {
        return super.display() + "\n"
             + "Prompts Left  : " + promptsRemaining + " this month";
    }
}
