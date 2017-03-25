/**
 * 
 */
package org.tutorials.springboot.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Chejerla Karthik
 *
 */
public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findCourseByTopicId(String topicId);
}
