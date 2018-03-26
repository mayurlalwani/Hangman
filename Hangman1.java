package hangman1;

public class Hangman1 {

    public static void main(String[] args) {
        
        Game game = new Game("hello");
        Prompter prompter = new Prompter(game);
        while(game.getRemainingTries() > 0 && !game.isWon()){
            prompter.displayProgress();
            prompter.promptForGuess(); 
        }
        prompter.displayOutcome();
        
       
    }
    
}
