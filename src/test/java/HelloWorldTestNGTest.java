import org.testng.annotations.Test;

public class HelloWorldTestNGTest {

    @Test
    void testMain() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        HelloWorld.main(args);
        System.out.println("TestNG");
        // Verify the results
    }
}
