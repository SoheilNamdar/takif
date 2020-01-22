package com.mkyong;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);



    @Query("select b from Book b where b.name=:name")
    List<Book> findNameHQL(@Param("name") String name);

    @Query(value = "select b.* from Book b where b.name=:name",nativeQuery = true)
    List<Book> findNameNative(@Param("name") String name);



    List<Book> findByNameLike(String name);

    @Query("select c from Book c where c.name like :name")
    List<Book> findByNameLikeHQL(@Param("name") String name);


}
