package com.shagil.siddiqui;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gauravgarg on 7/7/17.
 */
public interface LevelsRepository extends CrudRepository<Levels,String> {
}
