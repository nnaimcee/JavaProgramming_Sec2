import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://txtFile//MemberLogin.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			System.out.println(data[1].substring(0,1) + "." + data[0] + " (" + data[3].toUpperCase() + ")");
		}
		read.close();
	}

}
