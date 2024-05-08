package ma.ensaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ensaf.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
