package kr.hanbee.townmission.repository;

import kr.hanbee.townmission.config.DataSourceConfig;
import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;
import kr.hanbee.townmission.domain.Mission;
import kr.hanbee.townmission.dto.MissionCreateRequest;
import org.aspectj.apache.bcel.util.Repository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {DataSourceConfig.class})
@EnableJpaRepositories(basePackages = {"kr.hanbee.townmission.*"})
@EntityScan("kr.hanbee.townmission.*")
class MissionRepositoryTest {
    @Autowired MissionRepository missionRepository;

    @Test
    @DisplayName("미션 등록하기")
    void createMission() {
        // given
        String startAt = "2022-02-17 15:47:13.248";
        String endAt = "2022-02-17 14:47:13.248";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        MissionCreateRequest request = MissionCreateRequest.builder()
                .status(StatusType.OPEN)
                .startAt(LocalDateTime.parse(startAt, formatter))
                .endAt(LocalDateTime.parse(endAt, formatter))
                .adjustedYn(YesOrNoType.Y)
                .postalCode("12345")
                .contactYn(YesOrNoType.Y)
                .pay(10000)
                .settlementType(SettlementType.ON_SITE)
                .description("분리수거 해주실 분 찾아요!!!")
                .build();

        // when
        missionRepository.save(new Mission(request));

        // then
    }

}