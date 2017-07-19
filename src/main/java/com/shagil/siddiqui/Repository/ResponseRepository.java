package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gauravgarg on 18/7/17.
 */
@Repository
public interface ResponseRepository extends CrudRepository<Response,Integer>{

}
