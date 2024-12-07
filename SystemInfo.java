public class SystemInfo {
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
