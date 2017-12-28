package cn.et.dao;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */
public class Food extends AbstractFood implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Food() {
	}

	/** full constructor */
	public Food(String foodname, Double price, String path) {
		super(foodname, price, path);
	}

}
