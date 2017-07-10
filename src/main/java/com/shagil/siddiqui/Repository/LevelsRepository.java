package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Levels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by gauravgarg on 7/7/17.
 */
public interface LevelsRepository extends CrudRepository<Levels,String> {}
