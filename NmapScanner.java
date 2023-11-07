import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NmapScanner {

    public static void main(String[] args) {
        // Replace with the actual command and its parameters you want to run
        String[] command = {"nmap", "localhost"};

        try {
            // Run the nmap command
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Read the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the command to finish
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

