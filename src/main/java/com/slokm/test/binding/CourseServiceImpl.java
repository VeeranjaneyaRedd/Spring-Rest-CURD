package com.slokm.test.binding;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slokm.test.repo.CourseRepostry;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepostry courseRepostry;

	@Override
	public String Upsert(Course course) {
		courseRepostry.save(course);// upsert(insert / update based on pk)
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = courseRepostry.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		return courseRepostry.findAll();
		
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepostry.existsById(cid)) {
			courseRepostry.deleteById(cid);
			return "Detele success";
		}else {
			return "No Record found";
		}
	}

}
