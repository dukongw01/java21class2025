package example;
import java.io.IOException;

public class Printf02 {

    public static void main(String[] args) throws IOException {
        int keycode;
        keycode = System.in.read();
        
        System.out.println("keycode: " + keycode);
    }
}
