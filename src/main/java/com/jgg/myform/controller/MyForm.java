package com.jgg.myform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jgg.myform.dto.ArticleRequest;

	@RestController
	public class MyForm {
	
//		http://localhost:8080/article-get?title=제목content=내용
	    @GetMapping("/article-get")
	    public String articleGet(@RequestParam("title") String title, @RequestParam("content") String content) {
	        String result = "제목: " + title + "<br>내용: " + content;
	        return result;
	    }
	
//	    http://localhost:8080/article-post
	    @PostMapping("/article-post")
	    public String articlePost(@ModelAttribute ArticleRequest request) {
	       String result = "제목: " + request.title() + "<br>내용: " + request.content();
	        return result;
	    }
//	    포스트맨으로 테스트하세요
//	    http://localhost:8080/article-postman
	    @PostMapping("/article-postman")
	    public String articlePostman(@RequestBody ArticleRequest request) {
	    	String result = "제목: " + request.title() + "\n내용: " + request.content();
	    	return result;
	    }
	    
	    @PostMapping("/article-auto")
	    public String articleAuto(ArticleRequest request) {
	    	String result = "제목: " + request.title() + "\n내용: " + request.content();
	    	return result;
	    }
	}
