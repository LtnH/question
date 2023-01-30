package fr.gamedev.question.repository;

import fr.gamedev.question.data.User;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * interface de la classe User.
 *
 * @author djer1
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

  List<User> findByLastName(@Param("name") String name);

}
