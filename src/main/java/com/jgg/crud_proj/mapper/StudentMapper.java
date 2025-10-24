package com.jgg.crud_proj.mapper;

import java.util.List;

import com.jgg.crud_proj.domain.Student;

@Mapper
public interface StudentMapper {

	List<Student> findAll();

}
