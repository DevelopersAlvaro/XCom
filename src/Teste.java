
import java.nio.charset.StandardCharsets;


public class Teste {
	public static void main(String[] args) throws Exception {
	    printBytes("teste");
	    System.out.println(
	            new String(new byte[] { (byte) 0xE2 }, "ISO-8859-1"));
	    System.out.println(
	            new String(new byte[] { (byte) 0xC3, (byte) 0xA2 }, "UTF-8"));
	}

	private static void printBytes(String str) {
	   System.out.println("Bytes in " + str + " with UTF-8");
	   String resultado;
	    for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
	        System.out.printf("%3X", b);
	        ;
	    }
	    System.out.println(str.getBytes(StandardCharsets.UTF_8).toString());
	}
}
