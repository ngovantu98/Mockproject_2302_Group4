package com.vti.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.vti.entity.Group;
import com.vti.entity.Trip;

public class TripSpecification implements Specification<Trip> {

	private static final long serialVersionUID = 1L;
	private SearchCriteria criteria;

	public TripSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public Predicate toPredicate(Root<Trip> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

		if (criteria.getOperator().equalsIgnoreCase("Like")) {
			return criteriaBuilder.like(root.get(criteria.getKey()), "%" + criteria.getValue() + "%");
		}

		if (criteria.getOperator().equalsIgnoreCase(">=")) {
			return criteriaBuilder.greaterThanOrEqualTo(root.get(criteria.getKey()), criteria.getValue().toString());
		}

		if (criteria.getOperator().equalsIgnoreCase("<=")) {
			return criteriaBuilder.lessThanOrEqualTo(root.get(criteria.getKey()), criteria.getValue().toString());
		}

		return null;
	}

}
