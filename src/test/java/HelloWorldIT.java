import org.testng.annotations.Test;

public class HelloWorldIT {

    @Test
    void mainIntegrationTest() {
        // Setup
        final String[] args = new String[]{};

        // Run the test
        HelloWorld.main(args);
        System.out.println("Failsafe plugin");
        // Verify the results
    }
}
