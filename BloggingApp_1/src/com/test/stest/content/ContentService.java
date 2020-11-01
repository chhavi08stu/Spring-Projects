package com.tcs.stest.content;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.tcs.stest.content.dao.CategoryDAO;

@Service
public class ContentService {
	//@Autowired
    //private CategoryDAO categoryDAO;
    //put your code here.
	public List<Category> getAllContent() {
		List<Category> listC = new ArrayList<Category>();
		List<Course> list = new ArrayList<Course>();
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

		return new ArrayList<Category>();
	
	}
	
	
	
}
