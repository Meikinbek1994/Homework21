import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getFileWriter();
        getFileReader();




    }

    public static void getFileReader() {

        try (FileReader fileReader = new FileReader("myAlphabet.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }


        } catch (IOException e) {
            System.out.println("No such file");
        }
    }


        public static void getFileWriter() {

            try (FileWriter fileWriter = new FileWriter("myAlphabet.txt")) {

                fileWriter.write("1:Aa\n2:Bb\n3:Cc\n4:Dd\n5:Ee\n6:Ff\n7:Gg\n8:Hh\n9:Ii\n10:Jj\n11:Kk\n12:Ll\n13:Mm\n14:Nn\n15:Oo\n16:Pp\n17:Qq\n18:Rr\n19:Ss\n20:Tt\n21:Uu\n22:Vv\n23:Ww\n24:Xx\n25:Yy\n26:Zz");
                fileWriter.write("\n27:0\n28:1\n29:2\n30:3\n31:4\n32:5\n33:6\n34:7\n35:8\n36:9");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}