package com.exercise26streams.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WriterApp {

	public static void main(String[] args) {
		File myFile= null;
		FileWriter myWriter= null;
		BufferedWriter myBuffer =null;
		
		try 
		{
			myFile=new File("d:\\A\\hola.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			myBuffer.write("EL MACHO");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				myBuffer.close();
				myWriter=null;
				myFile=null;
				
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
