import java.io.*;

public class ioFile {
    public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\ManuJohn\\Downloads\\text.txt");
    FileWriter fw= new FileWriter(f);
    BufferedWriter writer = new BufferedWriter(fw);

    writer.write("Fist line");
    writer.newLine();
    writer.write("Second line");
    writer.newLine();
    writer.write("third line");
    writer.newLine();
    writer.close();

    System.out.println("File created");

}}
