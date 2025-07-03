import java.io.*;
class Task020 {
    public static void main (String args[])
    {
        try
        {
            byte b=0;
            FileInputStream infile = new FileInputStream("FileName1.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");
            int byteread;
            while((byteread = infile.read()) != -1) {
                b = (byte)byteread;
                outfile.write(b);
            }
            System.out.println("Byte Copied From in.txt to out.txt FIle ");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
