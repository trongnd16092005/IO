import java.io.File;
import java.util.Scanner;


public class DeleteFile {
    public void deleteFile(){
        Scanner sc= new Scanner(System.in);
        String path=sc.nextLine();
        File file=new File(path);
        if(file.exists()){
            if(file.isDirectory()){
                deleteDirectory(file);
            }
            else{
                file.delete();
                System.out.println("Success!");
            }
        }else{
            System.out.println("Error!!!");
        }
    }
    public void deleteDirectory(File file){
        int i=0;
        File[] children=file.listFiles();
        for(File child : children){
            child.delete();
            i++;
            System.out.println("Success "+i);
        }
    }
    public static void main(String[] args) {
        new DeleteFile().deleteFile();
    }
}
