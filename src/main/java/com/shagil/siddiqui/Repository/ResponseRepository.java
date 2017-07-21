package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Response;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by gauravgarg on 18/7/17.
 */
@Repository
public interface ResponseRepository extends CrudRepository<Response,Integer>{
    Response save(Response response);
    @Query(value = "select count(DISTINCT level) from response_table where user_name=:user and skill=:skill and is_completed= true ",nativeQuery = true)
    Integer countDistinctByUserNameAndSkill(@Param("user") String username, @Param("skill") String skill);
}
