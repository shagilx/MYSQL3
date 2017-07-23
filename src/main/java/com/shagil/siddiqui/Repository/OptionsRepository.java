package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shagil on 9/7/17.
 */
@Repository
public interface OptionsRepository extends CrudRepository<Option,Integer>{
}
