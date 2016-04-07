package org.rapes.rr.app.core.dao;

import java.util.List;

import org.rapes.rr.app.core.dom.MapRefference;
import org.rapes.rr.app.core.dom.MapRoute;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRouteRepository extends PagingAndSortingRepository<MapRoute, Long>{

	@Query("SELECT mr FROM MapRoute mr WHERE mr.parentMapRefference=:mapRefference")
	public List<MapRoute> getMapRoutesForMapRefference(@Param("mapRefference")MapRefference mapRefference);
}
