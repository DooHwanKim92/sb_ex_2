package com.ex2.qna.answer;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {

    @NotEmpty(message = "내용을 입력해주세요.")
    @Size(max = 200, message = "200자 이상 입력할 수 없습니다.")
    private String content;
}
