package org.quiz.app.Services;

import org.quiz.app.Model.DTO.QuestionDto;
import org.quiz.app.Model.Entity.Qustion;
import org.quiz.app.Repository.RepoEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
      private RepoEmp repo;

    public List<Qustion> getAllQustion(){
    return repo.findAll();
    }

    public List<Qustion> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    public String AddQuestion(Qustion qustion) {
        return String.valueOf(repo.save(qustion));
    }

    public QuestionDto Update(QuestionDto qustionto) {
    return QuestionDto.fromEntityToDto(repo.save(Qustion.toEntity(qustionto))) ;
    }


    public void delete(Integer id) {
    this.repo.deleteById(id);
    }

    public Qustion getQustion(Integer id) {
    Optional<Qustion> qustion = this.repo.findById(id);
        return  qustion.orElse(new Qustion());
    }
}

