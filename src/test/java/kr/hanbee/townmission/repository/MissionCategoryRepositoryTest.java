package kr.hanbee.townmission.repository;

import kr.hanbee.townmission.config.DataSourceConfig;
import kr.hanbee.townmission.constant.SettlementType;
import kr.hanbee.townmission.constant.StatusType;
import kr.hanbee.townmission.constant.YesOrNoType;
import kr.hanbee.townmission.domain.Mission;
import kr.hanbee.townmission.domain.MissionCategory;
import kr.hanbee.townmission.dto.mission.request.MissionCategoryRequest;
import kr.hanbee.townmission.dto.mission.request.MissionCreateRequest;
import kr.hanbee.townmission.repository.mission.MissionCategoryRepository;
import kr.hanbee.townmission.repository.mission.MissionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static kr.hanbee.townmission.constant.MissionCategoryType.*;
import static kr.hanbee.townmission.constant.MissionParentCategoryType.*;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = {DataSourceConfig.class})
@EnableJpaRepositories(basePackages = {"kr.hanbee.townmission.*"})
@EntityScan("kr.hanbee.townmission.*")
class MissionCategoryRepositoryTest {
    @Autowired
    MissionRepository repository;
    @Autowired
    MissionCategoryRepository categoryRepository;

    @Test
    @DisplayName("미션 카테고리 등록")
    void create() {
        // given
        String startAt = "2022-02-17 15:47:13.248";
        String endAt = "2022-02-17 14:47:13.248";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        MissionCreateRequest request = MissionCreateRequest.builder()
                .status(StatusType.OPEN)
                .startAt(LocalDateTime.parse(startAt, formatter))
                .endAt(LocalDateTime.parse(endAt, formatter))
                .adjustedYn(YesOrNoType.Y)
                .contactYn(YesOrNoType.Y)
                .pay(10000)
                .settlementType(SettlementType.ON_SITE)
                .description("분리수거 해주실 분 찾아요!!!")
                .categories(Arrays.asList(
                        new MissionCategoryRequest(FOOD_STORE, SERVING, 1),
                        new MissionCategoryRequest(FOOD_STORE, COOKING, 2)
                ))
                .build();

        // when
        Mission mission = repository.save(new Mission(request));
        request.getCategories().stream()
                .map(category -> new MissionCategory(mission, category))
                .forEach(mc -> categoryRepository.save(mc));

        // then
        List<MissionCategory> result = categoryRepository.findByMissionId(mission.getId());
        assertThat(result.size()).isEqualTo(2);
    }
}