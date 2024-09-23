package Test_Task.Vlad.Kulishov.repository;


import Test_Task.Vlad.Kulishov.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
