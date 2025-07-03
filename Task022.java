/*this task. The first command line argument is the old filename and the second is  the newfilename.
 */
import java.io.*;
class Task022 {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Usage: Java FileRename <oldfilename> <newfilename");
            return;
        }
        File f1 = new File(args[2]);
        File f2 = new File(args[1]);

        if (!f1.exists()) {
            System.out.println("File " + f1.getName() + " does not exits.");
            return;
        }
        if (f1.renameTo(f2)) {
            System.out.println("Rename file " + f1.getName() + " to " + f2.getName() + " is successful");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}

