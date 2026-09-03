
import java.util.Stack;

public class Undo {

    private static Undo instance;
    private Stack<String> commands;

    private Undo(){
        commands = new Stack<>();
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        this.commands.push(command);
    }

    public String undoCommand(){
        return "returnsAndEliminateTheLastCommand";
    }

    public void showHistory(){
        // prints all commands stored
    }

}
