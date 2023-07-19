package com.slokm.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokm.test.binding.Course;
import com.slokm.test.binding.CourseService;

@RestController
@RequestMapping("/course")
public class CourseRestController {
	@Autowired
	private CourseService courseService;

	@PostMapping("/save")
	public ResponseEntity<String> createCourse(@RequestBody Course course) {
		String status = courseService.Upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	@GetMapping("/courese/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
		Course course = courseService.getById(cid);
		return new ResponseEntity<Course>(course, HttpStatus.OK);

	}

	@GetMapping("/coures")
	public ResponseEntity<List<Course>> getAllcourses() {
		List<Course> allCourse = courseService.getAllCourse();
		return new ResponseEntity<>(allCourse, HttpStatus.OK);

	}

	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course) {
		String status = courseService.Upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@DeleteMapping("/courese/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
		String status = courseService.deleteById(cid);
		return new ResponseEntity<>(status,HttpStatus.OK);

	}
}