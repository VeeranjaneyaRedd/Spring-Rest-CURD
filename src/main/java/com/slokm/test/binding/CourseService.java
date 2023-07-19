package com.slokm.test.binding;

import java.util.List;

public interface CourseService {
	public String Upsert(Course course);

	public Course getById(Integer cid);

	public List<Course> getAllCourse();

	public String deleteById(Integer cid);

}
