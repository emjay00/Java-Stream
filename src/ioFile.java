import java.io.*;

public class ioFile {
    public static void main(String[] args) throws IOException {
    //File f = new File("C:\\Users\\ManuJohn\\Downloads\\test.txt");
    File f = new File("C:\\Users\\ManuJohn\\Downloads\\test.csv");
    //File f = new File("C:\\Users\\ManuJohn\\Downloads\\test.html");
    FileWriter fw= new FileWriter(f);
    BufferedWriter writer = new BufferedWriter(fw);

    //writer.write("<html> <body> <title> test page </title> <h1> TEST TEST TEST </h1> </body> </html>");
    /*writer.write("First line");
    writer.newLine();
    writer.write("Second line");
    writer.newLine();
    writer.write("third line");
    writer.newLine();
    writer.write("fourth line");
    writer.newLine();*/


    for (int i=0;i<4;i++)
    {
        for(int j=0;j<3;j++)
        {
            int num=(int)(Math.random()*100);
            writer.write(num+",");
        }
        writer.newLine();
    }


        writer.close();



    System.out.println("File created");

}}
