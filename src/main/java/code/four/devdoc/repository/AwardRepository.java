package code.four.devdoc.repository;

import code.four.devdoc.model.Award;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="award")
public interface AwardRepository  extends CrudRepository<Award, Long>  {
}
