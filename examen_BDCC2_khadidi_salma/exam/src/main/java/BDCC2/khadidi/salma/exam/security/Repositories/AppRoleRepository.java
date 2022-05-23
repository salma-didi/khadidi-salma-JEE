package BDCC2.khadidi.salma.exam.security.Repositories;

import BDCC2.khadidi.salma.exam.security.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String roleName);
}
