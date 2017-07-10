package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Levels;
import com.shagil.siddiqui.model.Question;
import com.shagil.siddiqui.model.Skills;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gauravgarg on 4/7/17.
 */
@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer> {
    @Query(value = "select * from questions_table where skill_text=:skill and level_text=:level",nativeQuery = true)
    List<Question> findBySkillAndLevel(@Param("skill")String skill,@Param("level")String level);
//    List<Question> findAllBySkillsAndLevels(Skills skill, Levels level);
}
