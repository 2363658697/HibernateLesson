package cn.et;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import cn.et.dao.AbstractFood;
import cn.et.dao.Food;

public class TestHb {

	@Test
	public  void saveFood() {
		Session session = HibernateSessionFactory.getSession();

		AbstractFood food=new Food();
		
		food.setPrice(667.0);

		food.setFoodname("鸡蛋kj");

		
		
		session.getTransaction().begin();

		session.save(food);

		session.getTransaction().commit();

	}
	
	@Test
	public  void deleteFood() {
		Session session = HibernateSessionFactory.getSession();

		Food food = new Food();

		food.setFoodid(11);

		session.getTransaction().begin();

		session.delete(food);

		session.getTransaction().commit();
	}
	
	@Test
	public  void updateFood() {
		Session session = HibernateSessionFactory.getSession();

		Food food = new Food();

		food.setFoodid(11);
		
		food.setPrice(555.0);

		session.getTransaction().begin();

		session.update(food);

		session.getTransaction().commit();
	}
	
	@Test
	public  void queryFood() {
		Session session = HibernateSessionFactory.getSession();


		Food food=(Food)session.load(Food.class, 6);
		System.out.println(food.getFoodname());
		
		// hsql語言
		Query query=session.createQuery("from Food where foodName like ? ");
		query.setString(0, "%鸡%");
		
		Query queryd=session.createQuery("from Food where foodName like :xx ");
		query.setString("xx", "%鸡%");
		
		
		List<Food> foodList=query.list();
		System.out.println(foodList.size());
	}
	
}
