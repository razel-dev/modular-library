package com.modularlib.io.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.modularlib.io.api.IFileIO;

public class FileIO implements IFileIO {
	
	public void writeToFile(String content, String filePath) throws IOException{
		try (FileWriter writer = new FileWriter(filePath)){
			writer.write(content);
		}
	}
	
	public void appendToFile(String content, String filePath) throws IOException{
		try (FileWriter writer = new FileWriter(filePath)){
			writer.write(content);
		}
	}

	public List<String> readLines(String filePath) throws IOException{
		  return Files.readAllLines(Paths.get(filePath));
	}
	public boolean fileExists(String filePath){
	    return Files.exists(Paths.get(filePath));
	}
}
