import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("1 FileReader,2  FileWriter ");
        switch (scanner.nextInt()){
            case 1:
                getFileReader();
            case 2:
                getFileWriter();


        }




    }
    public static void getFileReader(){
      try (FileReader fileReader=new FileReader("MySymvols.txt")) {
          Scanner scanner=new Scanner(fileReader);
          while(scanner.hasNextLine()){
              System.out.println(scanner.nextLine());
          }
      }  catch (IOException e){
          e.printStackTrace();
      }

    }
    public static void getFileWriter(){
     try( FileWriter fileWriter=new FileWriter("MySymvols.txt")) {
         for (char i = 'a',j='A'; i <='z' ; i++,j++) {
             fileWriter.write(j+" "+i+"\n");

             }
             for (int k = 0; k<10 ; k++) {
                 fileWriter.write( k +" \n");
             }
     }catch (IOException e){
         e.printStackTrace();
     }

    }
}