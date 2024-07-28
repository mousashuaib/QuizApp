package org.quiz.app.Conroller;

import org.quiz.app.Model.DTO.QuestionDto;
import org.quiz.app.Model.Entity.Qustion;
import org.quiz.app.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/QuizApp")

//this class Quizont
public class QuizController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/getAll")
    public List<Qustion> getAllQustion(){
        return questionService.getAllQustion();
    }

    @GetMapping("/get")
    public Qustion getQustion(@RequestParam Integer id){
        return questionService.getQustion(id);
    }

    @GetMapping("/category/{category}")
    public List<Qustion> getByCategory(@PathVariable String category){
        return questionService.getByCategory(category);
    }

    @PostMapping("AddQuestion")
    public String AddQuestion(@RequestBody Qustion qustion){
        return questionService.AddQuestion(qustion);
    }

    @PostMapping("/update")
    public QuestionDto Update(@RequestBody QuestionDto qustionto){
        return questionService.Update(qustionto);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam Integer id){
        questionService.delete(id);
    }
}
