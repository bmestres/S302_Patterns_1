import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    Undo testInstance = Undo.getInstance();

    @org.junit.jupiter.api.Test
    void sameUndoInstanceShouldBeReturnedAtEachCreation() {

        Undo shouldReferenceTheTestInstance = Undo.getInstance();
        assertEquals(testInstance, shouldReferenceTheTestInstance);
    }

    @org.junit.jupiter.api.Test
    void addCommandShouldResultInExpectedStack() {

        Stack<String> expectedStack = new Stack<>();
        expectedStack.addAll(List.of("mkdir folder", "cd folder"));

        testInstance.addCommand("mkdir folder");
        testInstance.addCommand("cd folder");

        assertEquals(expectedStack, testInstance.getAll());
    }

    @org.junit.jupiter.api.Test
    void undoCommandWithEmptyStackShouldThrowException() {
        assertThrows(IllegalStateException.class, ()-> testInstance.undoCommand());
    }

    @Test
    void undoCommandWhthNonEmptyStackShouldReturnTopCommand(){
        testInstance.addCommand("mkdir folder");
        testInstance.addCommand("cd folder");

        String topCommand = testInstance.undoCommand();
        assertEquals("cd folder", topCommand);
    }
}