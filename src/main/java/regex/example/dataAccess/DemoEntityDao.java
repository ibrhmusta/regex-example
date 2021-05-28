package regex.example.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import regex.example.entities.DemoEntity;

public interface DemoEntityDao extends JpaRepository<DemoEntity, Integer> {

}
