import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class UndoTest {

    @org.junit.jupiter.api.Test
    void sameUndoInstanceShouldBeReturnedAtEachCreation() {
        Undo firstInstance = Undo.getInstance();
        Undo shouldReferenceTheFirstInstance = Undo.getInstance();

        assertEquals(firstInstance, shouldReferenceTheFirstInstance);

    }

    @org.junit.jupiter.api.Test
    void addCommandShouldResultInExpectedStack() {

        Undo testInstance = Undo.getInstance();

        Stack<String> expectedStack = new Stack<>();
        expectedStack.addAll(List.of("mkdir folder", "cd folder"));

        testInstance.addCommand("mkdir folder");
        testInstance.addCommand("cd folder");

        assertEquals(expectedStack, testInstance);
    }

    @org.junit.jupiter.api.Test
    void undoCommandWithEmptyStackShouldThrowException() {
    }

    @Test
    void undoCommandWhthNonEmptyStackShouldReturnTopCommand(){

    }
}