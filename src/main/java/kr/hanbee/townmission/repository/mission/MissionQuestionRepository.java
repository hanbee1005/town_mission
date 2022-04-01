package kr.hanbee.townmission.repository.mission;

import kr.hanbee.townmission.domain.MissionQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionQuestionRepository extends JpaRepository<MissionQuestion, Long> {
}
