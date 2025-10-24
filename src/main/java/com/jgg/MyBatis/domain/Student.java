package com.jgg.MyBatis.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
	public class Student {

		private Long id;
		private String name;
		private String email;
		private Integer age;
		private LocalDateTime createdAt;
		private LocalDateTime updatedAt;
//		private LocalDateTime created_at;
//		private LocalDateTime updated_at;
		public void setId(Long id2) {
			// TODO Auto-generated method stub
			
		}
		

	}

