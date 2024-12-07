public class CPUCounter {
    /**
     * Returns the number of available CPUs (or cores) on the current machine.
     * 
     * @return The number of available processors.
     */
    public static int getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {
        // Test cases for the getCPUCount() function

        // Test 1: Verify that the returned value is greater than 0
        int cpuCount = getCPUCount();
        if (cpuCount > 0) {
            System.out.println("Test 1 Passed: Number of CPUs is greater than 0.");
        } else {
            System.out.println("Test 1 Failed: Number of CPUs is not greater than 0.");
        }

        // Test 2: Print the number of CPUs for manual verification
        System.out.println("Number of available CPUs on this machine: " + cpuCount);
    }
}
