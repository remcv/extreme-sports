package SimiAlex.com.gitlab.extremesportsapp.repositories;

import SimiAlex.com.gitlab.extremesportsapp.model.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserJpa, Integer> {

    public abstract Optional<UserJpa> findByUsername(String username);
}
