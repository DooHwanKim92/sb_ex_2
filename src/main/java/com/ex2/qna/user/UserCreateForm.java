package com.ex2.qna.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 25, message = "ID는 3~25자까지 입력가능합니다.")
    @NotEmpty(message = "사용자 ID는 필수항목 입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수항목 입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인은 필수항목 입니다.")
    private String password2;

    @NotEmpty(message = "이메일 필수항목 입니다.")
    @Email
    private String email;

}
