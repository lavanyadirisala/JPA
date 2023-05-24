package com.JPA.CriteriaQueries.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.JPA.CriteriaQueries.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service
public class CriteriaService {
	@Autowired
	private EntityManager entityManager;

	// condition based
	// Select
	public void selectquery() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		jakarta.persistence.criteria.CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		// CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		Root<StudentEntity> stud = cq.from(StudentEntity.class);
		// all values return - typed query		
		TypedQuery<StudentEntity> query = entityManager.createQuery(cq);
		StudentEntity singleResult = query.getSingleResult();
		System.out.println(singleResult.getS_id() + " " + singleResult.getS_age() + " " + singleResult.getS_name());
	}

	// OrderBy
	public void orderquery() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		jakarta.persistence.criteria.CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		// CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
		Root<StudentEntity> stud = cq.from(StudentEntity.class);
		CriteriaQuery<StudentEntity> order = cq.orderBy(cb.desc(stud.get("s_age")));
		Query q = entityManager.createQuery(order);
		List<StudentEntity> list = q.getResultList();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getS_id() + list.get(i).getS_name());		
		}
	}
		public void wherequery() {
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<StudentEntity>cq= cb.createQuery(StudentEntity.class);
			Root<StudentEntity>stud=cq.from(StudentEntity.class);
			CriteriaQuery<StudentEntity>where = cq.where(cb.greaterThanOrEqualTo(stud.get("s_age"),37));
			Query q=entityManager.createQuery(where);
			List<StudentEntity> list = q.getResultList();
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getS_id() + " " + list.get(i).getS_name());		

			}
	}
		
	/*
	 * @org.springframework.data.jpa.repository.Query(value
	 * ="Select * from Student ORDER BY CHAR_LENGTH(s_name)") public
	 * List<StudentEntity>findAllSortedByName();
	 */

}
