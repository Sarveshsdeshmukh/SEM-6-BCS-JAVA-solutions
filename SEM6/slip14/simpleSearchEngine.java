import java.io.*;

public class simpleSearchEngine {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleSearchEngine <search_string>");
            System.exit(1);
        }

        String searchString = args[0];
        File folder = new File(".");
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        for (File file : files) {
            new Thread(() -> searchInFile(searchString, file)).start();
        }
    }

    private static void searchInFile(String searchString, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println("Found '" + searchString + "' in file: " + file.getName() + " at line " + lineNumber);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
