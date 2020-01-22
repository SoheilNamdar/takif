package com.mkyong;

import com.mkyong.entity.TermStudentCorse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TermStudentCorseRepository extends CrudRepository<TermStudentCorse, Long> {





    List<TermStudentCorse> findByStudent_StudentCode(String studentCode);


    @Query(
            "select t from TermStudentCorse t " +
                    " left join t.student student" +
                    " where student.studentCode=:studentCode"
    )
    List<TermStudentCorse> findByStudent_StudentCodeHQL(@Param("studentCode") String studentCode);

    @Query(
            value = "select t.* from TermStudentCorse t " +
                    " left join student s on s.id=t.student_id" +
                    " where s.studentCode=:studentCode"
            ,nativeQuery = true
    )
    List<TermStudentCorse> findByStudent_StudentCodeSQL(@Param("studentCode") String studentCode);





}
