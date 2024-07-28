package org.quiz.app.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quiz.app.Model.DTO.QuestionDto;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Qustion {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String QustionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String diffecultyLevel;
    private String category;


    public static Qustion toEntity(QuestionDto dto) {
        return Qustion.builder().
                id(dto.getId()).
                QustionTitle(dto.getQustionTitle()).
                option1(dto.getOption1()).
                option2(dto.getOption2()).
                option3(dto.getOption3()).
                option4(dto.getOption4()).
                rightAnswer(dto.getRightAnswer()).
                diffecultyLevel(dto.getDiffecultyLevel()).
                category(dto.getCategory()).build();
    }
}
