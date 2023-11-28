import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileHandling {
	public static void main(String[] args) {
		char[]data=new char[30];
		FileReader input=null;
		FileWriter output=null;
		String content="Hello my name is lidiya";
		FileWriter info=null;
		try {
			info=new FileWriter("input.txt");
			info.write(content);
			info.flush();
			info.close();
			input =new FileReader("input.txt");
			int bytes=input.read(data);
			input.close();
			output = new FileWriter("output.txt");
			output.write(data,0,bytes);
			output.flush();
			output.close();
		}
		catch(IOException io) {
			System.out.println("ERROR...");
			io.printStackTrace();
			
			
			
		}
	}

}
