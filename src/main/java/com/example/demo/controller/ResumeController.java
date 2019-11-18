package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Resume;
import com.example.demo.repository.ResumeRepository;

@RestController
@RequestMapping("/resumes")
public class ResumeController {

	@Autowired
	ResumeRepository resumeRepository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Resume> getAllResume() {
		return resumeRepository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Resume getResumeById(@PathVariable("id") ObjectId id) {
		return resumeRepository.findBy_id(id);
	}

	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.OK)
	public void modifyResumeById(@PathVariable("id") ObjectId id, @Valid @RequestBody Resume resume) {
		resume.set_id(id);
		resumeRepository.save(resume);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Resume createResume(@Valid @RequestBody Resume resume) {
		resume.set_id(ObjectId.get());
		resumeRepository.save(resume);
		return resume;
	}

	@DeleteMapping("{id}")
	@ResponseStatus
	public void deleteResume(@PathVariable ObjectId id) {
		resumeRepository.delete(resumeRepository.findBy_id(id));
	}

}
