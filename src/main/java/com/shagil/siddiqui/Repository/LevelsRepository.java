package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gauravgarg on 7/7/17.
 */
@Repository
public interface LevelsRepository extends CrudRepository<Level,String> {}
