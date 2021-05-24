package ua.lviv.iot.bar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.bar.models.Glass;

@Repository
public interface GlassRepository extends JpaRepository<Glass, Integer> {

}
