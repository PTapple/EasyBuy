package com.entity;
import java.io.Serializable;
import java.util.List;

public class ProductCategory implements Serializable{

	private Integer id;//ID
	private String name;//名称
	private Integer parentId;//父级ID
	private Integer type;//分类级别
	private String iconClass;
	private String parentName;
	private List<ProductCategory> menu;
	private List<Product> photo;

	public List<Product> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Product> photo) {
		this.photo = photo;
	}

	public List<ProductCategory> getMenu() {
		return menu;
	}

	public void setMenu(List<ProductCategory> menu) {
		this.menu = menu;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	

	
}
