package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by gauravgarg on 11/7/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
//
//    @Query(value = "select * from users_table where user_name=:id and password=:pass",nativeQuery = true)
//    User findAllUsersByUserNameAndPassword(@Param("id")String id, @Param("pass")String pass);

    User findByUserNameAndPassword(String userName, String password);
}
