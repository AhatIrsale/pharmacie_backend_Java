package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Pharmacie;
import com.example.demo.entities.Ville;

@Repository
@EnableJpaRepositories
public interface PharmacieRepository  extends JpaRepository<Pharmacie,Long> {
	
	List<Pharmacie> findByZone(String zone);
	Pharmacie findById(int id);
	
	@Query("Select p from Pharmacie p ")
	List<Pharmacie> f( );
			
	
	@Query( value = "Select p.id, p.nom , p.laltitude, p.longitude ,p.photo ,p.user_id,p.zone_id, p.fav from pharmacie p , garde g ,pharmacie_garde pg , zone z  where p.id = pg.pharmacie and g.id=pg.garde and z.id=p.zone_id and z.nom= :zone and g.type= :periode",nativeQuery=true)
	//@Query("SELECT  p FROM Pharmacie p , Garde g ,PharmacieGarde pg , Zone z  where p.id = pg.pharmacie and g.id=pg.garde and z.id=p.zone and z.nom= :zone and g.Type= :periode")
	List<Pharmacie> FindPharmacieByZonePeriode( @Param("zone") String zone ,@Param("periode") String periode);
			

}
