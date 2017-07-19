package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gauravgarg on 12/7/17.
 */
@Repository
public interface ScoreRepository extends CrudRepository<Score,Integer>{

}
