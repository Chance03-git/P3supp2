public class MemoryChecker {
     /**
     * Checks if the system has enough memory to allocate the specified number of megabytes.
     * 
     * @param requiredMB The number of megabytes to check for availability.
     * @return True if the system has enough memory, false otherwise.
     */
    public static boolean hasEnoughMemory(int requiredMB) {
        long maxMemoryBytes = Runtime.getRuntime().maxMemory();
        long requiredBytes = (long) requiredMB * 1024 * 1024; // Convert MB to bytes
        return requiredBytes <= maxMemoryBytes;
    }
    public static void main(String[] args) {
        // Test cases for the hasEnoughMemory() function

        int[] testCases = {256, 1024, 2048, 4096}; // Memory sizes in MB to test

        for (int requiredMB : testCases) {
            boolean result = hasEnoughMemory(requiredMB);
            System.out.printf("Can allocate %d MB: %b%n", requiredMB, result);
        }
    }
}
