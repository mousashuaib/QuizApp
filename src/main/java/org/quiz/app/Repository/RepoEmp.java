package org.quiz.app.Repository;

import org.quiz.app.Model.Entity.Qustion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoEmp extends JpaRepository<Qustion,Integer> {
    List<Qustion> findByCategory(String category);
}
