package org.jsp.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

public class selectingData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Criteria");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		CriteriaBuilder builder = manager.getCriteriaBuilder();
		/*
		 * CriteriaQuery<Employee> select= builder.createQuery(Employee.class);
		 * Root<Employee> from = select.from(Employee.class);
		 * 
		 * select.where(builder.and(builder.greaterThan(from.get("esal"), 1000),
		 * builder.between(from.get("eid"), 10, 20)));
		 * 
		 * Query query = manager.createQuery(select); List<Employee>
		 * list=query.getResultList(); System.out.println(list);
		 * 
		 * manager.getTransaction().commit();
		 */

		
		//update
		
		
		CriteriaUpdate<Employee> update = builder.createCriteriaUpdate(Employee.class);

		Root<Employee> from = update.from(Employee.class);
		update.set(from.get("esal"), 5000);
		update.where(builder.like(from.get("ename"), "a%"));
		Query query= manager.createQuery(update);
		query.executeUpdate();
		System.out.println("Updated..");

		
		
		//delete
//		
//		CriteriaDelete<Employee> delete = builder.createCriteriaDelete(Employee.class);
//		Root<Employee> from = delete.from(Employee.class);
//		delete.where(builder.and(builder.equal(from.get("edesignation"), "Tester"),
//		builder.greaterThan(from.get("esal"), 10000)));
//
//		Query query = manager.createQuery(delete);
//		query.executeUpdate();
//		System.out.println("Deleted...");

		manager.getTransaction().commit();

	}
}
