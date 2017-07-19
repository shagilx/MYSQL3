package com.shagil.siddiqui.Repository;

import com.shagil.siddiqui.model.Level;
import com.shagil.siddiqui.model.Question;
import com.shagil.siddiqui.model.Skill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gauravgarg on 4/7/17.
 */
@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer> {
    @Query(value = "select * from questions_table where skill_text=:skill and level_text=:level",nativeQuery = true)
    List<Question> findAllBySkillAndLevel(@Param("skill")String skill,@Param("level")String level);
//    @Query(value = "select * from questions_table where skill_text in:skill",nativeQuery = true)
//    List<Question> findAllBySkillIn(@Param("skills") String skill);
    @Query(value = "select distinct (l.leveltext),l.id from levels_table as l, questions_table as q where l.leveltext=q.level_text and q.skill_text=:skill ORDER BY l.id;",nativeQuery = true)
    List<Level>findDistinctBySkill(@Param("skill") String skill);
}
