package code.four.devdoc.repository;

import code.four.devdoc.model.PersonalInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="personalinfo")
public interface PersonalInfoRepository extends CrudRepository<PersonalInfo, Long> {
}
