package com.da.coding.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSingleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SerializableSingleton(){
		
	}
	
	public static class SerializableSingletonHelper{
		private static final SerializableSingleton SINGLETON= new SerializableSingleton();
	}
	
	public static SerializableSingleton getInstance(){
		return SerializableSingletonHelper.SINGLETON;
	}
	
	//this method is required else two instances of Singleton will be created
	public Object readResolve(){
		return getInstance();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializableSingleton singleton1= SerializableSingleton.getInstance();
		ObjectOutput objectOutput= new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		objectOutput.writeObject(singleton1);
		objectOutput.close();
		
		ObjectInput objectInput= new ObjectInputStream(new FileInputStream("singleton.ser"));
		Object object = objectInput.readObject();
		SerializableSingleton singleton2= (SerializableSingleton) object;
		objectInput.close();
		
		if(singleton1.hashCode()==singleton2.hashCode()){
			System.out.println("singleton is preserved");
		}else{
			System.out.println("singleton is broken");
		}
	}
}
