package com.jgg.crud_proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jgg.crud_proj.domain.Student;
import com.jgg.crud_proj.mapper.StudentMapper;

@Service
@RequiredArgsConstructors
@Transactional(readOnly = true)
public class StudentService {
	private final StudentMapper studentMapper = null;
	
	public List<Student> getAllStudents() {
		return studentMapper.findAll();
	}
}
