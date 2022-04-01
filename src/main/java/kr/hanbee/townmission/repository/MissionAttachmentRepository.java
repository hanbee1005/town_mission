package kr.hanbee.townmission.repository;

import kr.hanbee.townmission.domain.MissionAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionAttachmentRepository extends JpaRepository<MissionAttachment, Long> {
}
