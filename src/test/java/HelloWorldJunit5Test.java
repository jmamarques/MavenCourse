import org.junit.jupiter.api.Test;

public class HelloWorldJunit5Test {

    @Test
    void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        HelloWorld.main(args);
        System.out.println("Junit5");
        // Verify the results
    }
}
