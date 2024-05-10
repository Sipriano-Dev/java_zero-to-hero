import java.io.CharArrayWriter;
import java.io.IOException;

public class StringMutableDemo {

    public static void main(String[] args) throws IOException {

        //Approach 1
        StringBuilder stb = new StringBuilder();
        stb.append("World");
        stb.insert(0, "Hello ");
        stb.deleteCharAt(4);
        stb.insert(4, 'o');
        stb.setLength(5);
        stb.reverse();
        String str = stb.toString();

        //Approach 2
        StringBuffer stb2 = new StringBuffer();
        stb2.append("World");
        stb2.insert(0, "Hello ");
        stb2.deleteCharAt(4);
        stb2.insert(4, 'o');
        stb2.setLength(5);
        stb2.reverse();
        String str2 = stb2.toString();

        // Approach 3
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("Hello");
        cw.write(" World");
        String string3 = cw.toString();

    }

}
