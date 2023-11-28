package com.yoon.projectadmin.controller;

import com.yoon.projectadmin.config.SecurityConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 컨트롤러 - 회원 관리")
@Import(SecurityConfig.class)
@WebMvcTest(ArticleManagementController.class)
class UserAccountManagementControllerTest {

    private final MockMvc mockMvc;

    public UserAccountManagementControllerTest(@Autowired MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @DisplayName("[view][GET] 회원 관리 페이지 - 정상 호출")
    @Test
    void givenNothing_whenRequestingUserAccountManagementView_thenReturnsUserAccountManagementView() throws Exception {
        //given
        //when & then
        mockMvc.perform(get("/management/user-accounts"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))    //지정한 것과 호환되는 것이면 충분하다.
                .andExpect(view().name("/management/user-accounts"));
    }
}
