package java11Assignments;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CountStudentList {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\BHARAKN\\studentsList\\StudentList.txt");
		//String line;
		//int count=0;

		//opens a file in read mode

		//FileReader file = new FileReader("Students data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;

		//Gets each line till end of file is reached

		while((st=br.readLine())!=null)
		//split each line into words
		//String words[]=line.split("");
		//counts each word
		//count=count+words.length;


		System.out.println(st);
		//br.close();



		}



}
