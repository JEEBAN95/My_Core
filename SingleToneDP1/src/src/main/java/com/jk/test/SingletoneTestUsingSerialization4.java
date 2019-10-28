package com.jk.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

import com.jk.classes.Printer4;

public class SingletoneTestUsingSerialization4 {

	public static void main(String[] args) {

		Printer4 pr1, pr2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			pr1 = Printer4.getInstance();
			System.out.println("pr hashCode  " + pr1.hashCode());
			oos = new ObjectOutputStream(new FileOutputStream("C:/Users/pc/Desktop/singleTone.txt"));
			oos.writeObject(pr1);

			System.out.println("Serialization Performed");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ois = new ObjectInputStream(new FileInputStream("C:/Users/pc/Desktop/singleTone.txt"));
			pr2 = (Printer4) ois.readObject();
			System.out.println(pr2.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
