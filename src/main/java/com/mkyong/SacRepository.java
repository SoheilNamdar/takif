package com.mkyong;

import com.mkyong.model.Sac;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SacRepository extends CrudRepository<Sac, Long> {

    List<Sac> findByName(String name);

    @Query("select s from Sac s where s.name=:name")
    List<Sac> findByNameHQL(@Param("name") String name);

    @Query(value = "select s.* from Sac s where s.name=:name", nativeQuery = true)
    List<Sac> findByNameNative(@Param("name") String name);

    @Query(value = "select s.* from Sac s where s.name Like :name", nativeQuery = true)
    List<Sac> findByNameLike(@Param("name") String name);



}
