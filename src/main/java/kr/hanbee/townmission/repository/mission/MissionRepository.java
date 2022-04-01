package kr.hanbee.townmission.repository.mission;

import kr.hanbee.townmission.domain.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
