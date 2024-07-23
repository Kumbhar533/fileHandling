package com.file.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -971008948138107519L;

	private int id;

	private String name;

	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}

public class SerializationExample {

	public static void main(String[] args) {

		String filePath = "person.ser";

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {

			person person = new person(123, "Alice", "alice@gmail.com");
			person person1 = new person(155, "Jhon", "jhon@gamil.com");
			person person2 = new person(197, "Fuddu", "fuddu@gmail.com");

			objectOutputStream.writeObject(person);
			objectOutputStream.writeObject(person1);
			objectOutputStream.writeObject(person2);

			System.out.println("Object is wriite in the file sucessfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {

			person p = (person) inputStream.readObject();
			person p1 = (person) inputStream.readObject();
			person p2 = (person) inputStream.readObject();

			System.out.println(p);
			System.out.println(p1);
			System.out.println(p2);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}