import java.io.File;
import java.util.Arrays;

class FileFinder {
    public static void main(String[] args) {
        FileFinder finder = new FileFinder();

        // Set the directory to search and the filename
        File rootDir = new File("D:\\nafath"); // change this path
        String fileName = "Mini_Bank_System.pdf"; // change this filename

        // Search for the file
        File foundFile = finder.findFileByName(rootDir, fileName);

        // Print the result
        if (foundFile != null) {
            System.out.println("File found at: " + foundFile.getAbsolutePath());
        } else {
            System.out.println("File not found.");
        }
    }
    /**
     * TO-DO: Change this method to be recursive.
     \*
     * This method searches for a file with a specific name within a directory
     * and its subdirectories. The current implementation uses a Queue for an
     * iterative, breadth-first search.
     \*
     * @param rootDir The directory to start the search from.
     * @param fileName The name of the file to find.
     * @return The File object if found, otherwise null.
     */
    public File findFileByName(File rootDir, String fileName) {
        if(!rootDir.isDirectory()) {
            return null;
        }
        File[] files=rootDir.listFiles();
        if(files !=null) {
            for (File file : files) {
                System.out.println(file.getName());
                if (file.isFile() && file.getName().equals(fileName))
                    return file;
                else if (file.isDirectory()) {
                    File isFound= findFileByName(file,fileName);
                    if(isFound!=null)
                        return isFound;
                }
                }

            }
       return null;
        }
//

}