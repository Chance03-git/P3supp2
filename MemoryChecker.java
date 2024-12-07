public class MemoryChecker {
    public static void main(String[] args) {
        // Test cases for the hasEnoughMemory() function

        int[] testCases = {256, 1024, 2048, 4096}; // Memory sizes in MB to test

        for (int requiredMB : testCases) {
            boolean result = hasEnoughMemory(requiredMB);
            System.out.printf("Can allocate %d MB: %b%n", requiredMB, result);
        }
    }
}
