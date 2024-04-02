package com.auth.demo.oauth.vcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.auth.demo.auth.controller
 * fileName       : Vcontroller
 * author         : user
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01        user       최초 생성
 **/

@Controller
public class OauthVController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}