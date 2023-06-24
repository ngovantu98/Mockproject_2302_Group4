package com.vti.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.vti.dto.filter.TourFilter;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Tour;
import com.vti.entity.Trip;

public class TourSpecificationBuilder {

	private TourFilter filter;
	private String search;

	public TourSpecificationBuilder(TourFilter filter, String search) {
		this.filter = filter;
		this.search = search;
	}

	@SuppressWarnings("deprecation")
	public Specification<Tour> build() {

		SearchCriteria seachCriteria = new SearchCriteria("name", "Like", search);
		SearchCriteria minTotalMemberCriteria = new SearchCriteria("totalMember", ">=", filter.getMinTotalMember());
		SearchCriteria maxTotalMemberCriteria = new SearchCriteria("totalMember", "<=", filter.getMaxTotalMember());

		Specification<Tour> where = null;

		// search
		if (!StringUtils.isEmpty(search)) {
			where = new TourSpecification(seachCriteria);
		}

		// min totalMember filter
		if (filter.getMinTotalMember() != 0) {
			if (where != null) {
				where = where.and(new TourSpecification(minTotalMemberCriteria));
			} else {
				where = new TourSpecification(minTotalMemberCriteria);
			}
		}

		// max totalMember filter
		if (filter.getMaxTotalMember() != 0) {
			if (where != null) {
				where = where.and(new TourSpecification(maxTotalMemberCriteria));
			} else {
				where = new TourSpecification(maxTotalMemberCriteria);
			}
		}

		return where;
	}
}
