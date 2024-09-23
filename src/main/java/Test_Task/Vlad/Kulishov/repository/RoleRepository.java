package Test_Task.Vlad.Kulishov.repository;


import Test_Task.Vlad.Kulishov.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
