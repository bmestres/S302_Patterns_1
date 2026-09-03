
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

    public Stack<String> getAll(){
        return this.commands;
    }

    public String undoCommand(){
        if(this.commands.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return this.commands.pop();
    }

    public void showHistory(){
        this.commands.forEach(command -> System.out.println(command));
    }
}
