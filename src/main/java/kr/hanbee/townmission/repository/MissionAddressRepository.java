package kr.hanbee.townmission.repository;

import kr.hanbee.townmission.domain.MissionAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionAddressRepository extends JpaRepository<MissionAddress, Long> {
}
