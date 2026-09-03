
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
        String topCommand = this.commands.peek();
        this.commands.pop();
        return topCommand;
    }

    public void showHistory(){
        this.commands.forEach(command -> System.out.println(command));
    }
}
