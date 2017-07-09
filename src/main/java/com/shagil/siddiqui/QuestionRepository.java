package com.shagil.siddiqui;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gauravgarg on 4/7/17.
 */
public interface QuestionRepository extends CrudRepository<Question,Integer> {

}
