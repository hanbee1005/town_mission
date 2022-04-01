package kr.hanbee.townmission.repository;

import kr.hanbee.townmission.domain.MissionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionCategoryRepository extends JpaRepository<MissionCategory, Long> {
    /**
     * 미션 별 카테고리 조회
     * @param missionId
     * @return
     */
    List<MissionCategory> findByMissionId(Long missionId);
}
