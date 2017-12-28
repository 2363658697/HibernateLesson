package cn.et.dao;

/**
 * AbstractFood entity provides the base persistence definition of the Food
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFood implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double price;
	private String path;

	// Constructors

	/** default constructor */
	public AbstractFood() {
	}

	/** full constructor */
	public AbstractFood(String foodname, Double price, String path) {
		this.foodname = foodname;
		this.price = price;
		this.path = path;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}