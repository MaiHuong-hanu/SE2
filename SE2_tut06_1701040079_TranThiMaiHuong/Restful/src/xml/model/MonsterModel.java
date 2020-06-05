package xml.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MonsterModel {
	private String name;
	private String category;
	public MonsterModel() {
		super();
	}
	public MonsterModel(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	

}
