package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Resume;
import com.example.demo.repository.ResumeRepository;

@RestController
@RequestMapping("/resume")
public class ResumeController {

	@Autowired
	ResumeRepository resumeRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Resume> getAllResume() {
		return resumeRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Resume getResumeById(@PathVariable("id") ObjectId id) {
		return resumeRepository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyResumeById(@PathVariable("id") ObjectId id, @Valid @RequestBody Resume resume) {
		resume.set_id(id);
		resumeRepository.save(resume);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Resume createResume(@Valid @RequestBody Resume resume) {
		resume.set_id(ObjectId.get());
		resumeRepository.save(resume);
		return resume;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteResume(@PathVariable ObjectId id) {
		resumeRepository.delete(resumeRepository.findBy_id(id));
	}

}
