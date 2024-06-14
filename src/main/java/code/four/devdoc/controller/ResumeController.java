package code.four.devdoc.controller;

import code.four.devdoc.model.Resume;
import code.four.devdoc.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @Autowired
    private ResumeRepository resumeRepository;

    @RequestMapping("/resumes")
    public Iterable<Resume> getResumes() {
        return resumeRepository.findAll();
    }
}
