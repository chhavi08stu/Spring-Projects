package com.tcs.stest.content;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ContentController {
	/*@Autowired
	private CategoryRepository cRepository;
@Autowired
	private ContentService cService;*/
	private CategoryRepository em;
	
		private ContentService cService;
	/*@GetMapping("/category")
	public List<Category> getAllEmployees() {
		return cRepository.findAll();
	}

	// Put your code here.
	@RequestMapping(method = RequestMethod.GET, path = "/category/{id}")
	public ResponseEntity<Category> getCourseDetails(@PathVariable(value = "id") Integer id)
			throws ResourceNotFoundException {
		Category employee = cRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		return ResponseEntity.ok().body(employee);
	}*/
	@RequestMapping(method = RequestMethod.GET, path = "/category/{id}")
	public List<Category> getCategory() {
		List<Category> listC = new ArrayList<Category>();

		Category category = em.findAll(Category.class, 1);
		List<Course> list  = category.getCourseList();
		
		//List<Course> list = new ArrayList<Course>();
		Course c1 = new Course(1, "AWS Integration with DevOps", 1, 12, 1);
		Course c2 = new Course(2, "AWS Integration with Java", 10, 01, 1);
		list.add(c1);
		list.add(c2);

		Category cat1 = new Category(1001, "Cloud", "AWS", list);

		list.clear();

		c1 = new Course(4, "Azure Integration with DevOps", 1, 12, 1);
		c2 = new Course(5, "Azure Integration with Java", 10, 01, 1);
		list.add(c1);
		list.add(c2);

		Category cat2 = new Category(1001, "Cloud", "Azure", list);

		listC.add(cat1);
		listC.add(cat2);

		return listC;
		// return null;
	}
}
