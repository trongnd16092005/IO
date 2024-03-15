import java.io.File;
import java.util.Scanner;

public class SizeOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path=sc.nextLine();
        File file= new File(path);
        if(file.exists()){
            System.out.println(file.length());
        }
        else{
            System.out.println("Error!!!");
        }
    }
}
