package com.mkyong;

import com.mkyong.model.Sac;
import com.mkyong.model.SacMecanismeAccessoire;
import org.hibernate.criterion.LikeExpression;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SacMecanismeAccessoireRepository extends CrudRepository<Sac, Long> {

    List<SacMecanismeAccessoire> findByMecanisme_

}
