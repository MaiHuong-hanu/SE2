
package model;

/**
 * This is a model class represents a User entity for the table User in database
 */

public class Subject {
	protected int id;
	protected String name;
	protected String level;
	public Subject(int id, String name, String level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}
	public Subject() {
		super();
	}
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	
}
