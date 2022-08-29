package com.globallogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.model.Admin;
import com.globallogic.model.Course;
import com.globallogic.model.Exam;
import com.globallogic.model.Paper;
import com.globallogic.model.Staff;
import com.globallogic.model.Student;
import com.globallogic.model.Subject;

import com.globallogic.repo.CourseRepo;
import com.globallogic.repo.ExamRepo;
import com.globallogic.repo.PaperRepo;
import com.globallogic.repo.StaffRepo;
import com.globallogic.repo.StudentRepo;
import com.globallogic.repo.SubjectRepo;

import com.globallogic.service.AdminService;
import com.globallogic.service.CourseService;
import com.globallogic.service.ExamService;
import com.globallogic.service.PaperService;
import com.globallogic.service.StaffService;
import com.globallogic.service.StudentService;
import com.globallogic.service.SubjectService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@Autowired
	StudentRepo studentrepo;
	
	@Autowired
	StaffRepo staffrepo;
	
	@Autowired
	CourseService courseservice;
	
	@Autowired
	CourseRepo courserepo;
	
	@Autowired
	SubjectRepo subjectrepo;
	
	@Autowired
	SubjectService subjectservice;
	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	StaffService staffservice;
	
	@Autowired
	PaperRepo paperrepo;
	
	@Autowired
	PaperService paperservice;
	
	@Autowired
	ExamRepo examrepo;
	
	@Autowired
	ExamService examservice;
	
	@GetMapping("/")
	public List<Admin> getAdmin(){
		return adminservice.getAdmin();
	}
	
	@PostMapping("/")
	public String addAdmin(@RequestBody Admin admin) {
		
		List<Student> student = new ArrayList<>();
		for(Student a:admin.getStudent()) {
			Student s = studentrepo.findById(a.getId()).get() ;
			student.add(s);
		}
		
		List<Staff> staff = new ArrayList<>();
		for(Staff a:admin.getStaff()) {
			Staff s = staffrepo.findById(a.getId()).get();
			staff.add(s);
		}
		admin.setStudent(student);
		admin.setStaff(staff);
		adminservice.addAdmin(admin);
		return "Record has been added!";
		
	}
	
	@PutMapping("/")
	public Admin updateAdmin(Admin admin) {
		adminservice.updateAdmin(admin);
		return admin;
	}
	
	@DeleteMapping("/{id}")
	public String deleteAdmin(@PathVariable("id") int id) {
		adminservice.deleteAdmin(id);
		return "Record has been deleted!";
	}
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		
		List<Subject> subject = new ArrayList<>();
		for(Subject a:course.getSubject()) {
			Subject s = subjectrepo.findById(a.getId()).get();
			subject.add(s);
		}
		course.setSubject(subject);
		courseservice.addCourse(course);
		return "New Course has been added!";
	}
	
	@PostMapping("/addSubject")
	public String addSubject(@RequestBody Subject subject) {
		subjectservice.addSubject(subject);
		return "New Subject has been added!";
	}
	
	@PostMapping("/newAdmission")
	public String addStudent(@RequestBody Student student) {
		
		List<Course> course = new ArrayList<>();
		for(Course a:student.getCourse()) {
			Course s = courserepo.findById(a.getId()).get();
			course.add(s);
		}
		student.setCourse(course);
		studentservice.addStudent(student);
		return "New Student has been admitted!";
	}
	
	@PostMapping("/addStaff")
	public String addStaff(@RequestBody Staff staff) {
		
		List<Exam> exam = new ArrayList<>();
		for(Exam a:staff.getExam()) {
			Exam s = examrepo.findById(a.getId()).get();
			exam.add(s);
		}
		staff.setExam(exam);
		staffservice.addStaff(staff);
		return "New Staff has been added!";
	}
	
	@DeleteMapping("/deleteStaff/{id}")
	public String deleteStaff(@PathVariable("id") int id) {
		staffservice.deleteStaff(id);
		return "Record has been deleted!";
	}
	
	@PostMapping("/createExam")
	public String addExam(@RequestBody Exam exam) {
		
		List<Paper> paper = new ArrayList<>();
		for(Paper a:exam.getPaper()) {
			Paper s = paperrepo.findById(a.getId()).get();
			paper.add(s);
		}
		exam.setPaper(paper);
		examservice.addExam(exam);
		return "New Exam has been created!";
	}
	
	@PostMapping("/addQuestion")
	public String addPaper(@RequestBody Paper paper) {
		paperservice.addPaper(paper);
		return "New Question has been added!";
	}
	
	@GetMapping("/students")
	public List<String> getStudentbyName(){
		List<Student> student = studentservice.getStudentbyName();
		
		List<String> name = new ArrayList<>();
		
		for(Student a: student) {
			name.add(a.getName());
		}
		return name ;
	}
	
}
