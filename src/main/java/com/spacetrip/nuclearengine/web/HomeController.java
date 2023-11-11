package com.spacetrip.nuclearengine.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peter Liu 河图
 * @version JDK1.8【JDK8u45】
 * @see HomeController
 * @since Nov.11.2023
 */
@RestController("/")
public class HomeController {
    @GetMapping("/health")
    public String health(){
        return "UP";
    }
}
