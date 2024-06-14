package code.four.devdoc.repository;

import code.four.devdoc.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="resume")
public interface ResumeRepository extends CrudRepository<Resume, Long> {
}
