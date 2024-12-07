public class SystemInfo {
    /**
     * Gets the system architecture as a string.
     * 
     * @return The architecture of the system, e.g., "x86_64".
     */
    public static String getSystemArchitecture() {
        return System.getProperty("os.arch");
    }
    public static long getTotalMemory() {
        /**
     * Gets the total memory (RAM) of the system in bytes.
     * 
     * @return The total memory in bytes as a long value.
     */

        return Runtime.getRuntime().maxMemory();
    }

    public static void main(String[] args) {
        // Test: Retrieve and print system information

        // Get system architecture
        String architecture = getSystemArchitecture();
        System.out.println("System Architecture: " + architecture);

        // Get total memory
        long totalMemoryBytes = getTotalMemory();
        double totalMemoryMB = totalMemoryBytes / (1024.0 * 1024.0);
        System.out.printf("Total Memory: %.2f MB (%d bytes)%n", totalMemoryMB, totalMemoryBytes);
    }
}
