package com.telegrambot.BotTelegram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import controladores.Puntos;
import org.springframework.stereotype.Service;

import com.telegrambot.BotTelegram.bot.BotTelegram;

@Controller
@SpringBootApplication
public class BotTelegramApplication {

    private BotTelegram service;

    public BotTelegramApplication (BotTelegram service) {
        this.service =  service;
    }

	@PostMapping("/a")
	void onUpdate(){
	service.onGitupdate();
	}
	@RequestMapping("/")
	@ResponseBody
	String home(){
	return "hello world";
}
	public static void main(String[] args) {
		SpringApplication.run(BotTelegramApplication.class, args);
	}

}
