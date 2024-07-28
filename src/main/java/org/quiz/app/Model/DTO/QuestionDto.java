package org.quiz.app.Model.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quiz.app.Model.Entity.Qustion;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class QuestionDto {
        private  Integer id;
        private String QustionTitle;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private String rightAnswer;
        private String diffecultyLevel;
        private String category;

        public static QuestionDto fromEntityToDto(Qustion entity) {
        return QuestionDto.builder().
                id(entity.getId()).
                QustionTitle(entity.getQustionTitle()).
                option1(entity.getOption1()).
                option2(entity.getOption2()).
                option3(entity.getOption3()).
                option4(entity.getOption4()).
                rightAnswer(entity.getRightAnswer()).
                diffecultyLevel(entity.getDiffecultyLevel()).
                category(entity.getCategory()).build();
}
}
