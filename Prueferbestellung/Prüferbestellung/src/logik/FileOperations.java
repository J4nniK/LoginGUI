package logik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	private File file;
	private String filePath;


	public FileOperations ()
	{
		this.file = new File(filePath);
		
	}
	
	
	public String getLocation() {
		return this.filePath;
	}

	public void setLocation(String location) {
		this.filePath = location;
	}

	public void createFile() throws IOException {

		if (this.file.exists())
			System.out.println("The file exists.");
		else
			this.file.createNewFile();
		System.out.println("File created.");

	}

	public void readFile() {

		try {
			
			Scanner fileReader = new Scanner(file);
			if (fileReader.hasNextLine() == true) {
				while (fileReader.hasNextLine()) {
					String data = fileReader.nextLine();
					System.out.println(data);
				}
			} else {
				System.out.println("The file is empty.");
			}

			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public String getFileData() {
		String data = "";
	
		try {
			
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				data = data + fileReader.nextLine() + "\n";

			}
			fileReader.close();

			return data;
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println("The file is empty.");
		return null;
		
	}

	public void deleteFile() {
		this.file.delete();
		System.out.println("File deleted.");
	}

	public void writeToFile(String text) throws IOException {

		String oldFileData = getFileData();
		try {
			FileWriter myWriter = new FileWriter(this.filePath);
			String newFileData = oldFileData +text;
			myWriter.write(newFileData);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void showFiles(String path) {

		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				files = listOfFiles[i].getName();
				System.out.println(files);
			}
		}
	}

	public void listCertainFiles(String path, String fileEnding) {

		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				files = listOfFiles[i].getName();
				if (files.endsWith(fileEnding) || files.endsWith(fileEnding.toUpperCase())) {
					System.out.println(files);
				}
			}
		}

	}
	
	public void findFile(String name, File file)
    {
        File[] list = file.listFiles();
        if(list!=null) {
        	  for (File fil : list)
              {
                  if (fil.isDirectory())
                  {
                      findFile(name,fil);
                  }
                  else if (name.equalsIgnoreCase(fil.getName()))
                  {
                      System.out.println(fil.getParentFile());
                  }
              }
        }else {
        	System.out.println("Die Datei ist nicht vorhanden.");
        }
      
    }

	public void searchEntry(String keyword) {

		String data = "";
		int counter = 0;
		try {

			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNextLine()) {
				// data = data + fileReader.nextLine() + "\n";
				data = fileReader.nextLine();

				if (data.contains(keyword)) {

					System.out.println("The element is at the position: " + counter);

				} else {
					counter = counter + 1;
				}

			}
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	
	
	
}
