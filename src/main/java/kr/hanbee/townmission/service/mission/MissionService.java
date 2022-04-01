package kr.hanbee.townmission.service.mission;

import kr.hanbee.townmission.domain.Mission;
import kr.hanbee.townmission.dto.*;
import kr.hanbee.townmission.dto.mission.request.MissionCreateRequest;
import kr.hanbee.townmission.dto.mission.response.MissionListResponse;
import kr.hanbee.townmission.dto.mission.request.MissionListSearchRequest;
import kr.hanbee.townmission.dto.mission.response.MissionResponse;
import kr.hanbee.townmission.repository.mission.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissionService {

    private final MissionRepository missionRepository;

    /**
     * 미션 등록하기
     * @param request
     * @return
     */
    @Transactional
    public ResponseEntity<CommonResponse> create(MissionCreateRequest request) {

        // 미션 등록
        Mission mission = missionRepository.save(new Mission(request));

        // 미션 카테고리 등록

        // 미션 주소 등록

        // 미션 첨부파일 등록

        // 미션 질문 등록

        return CommonResponse.ok(mission.getId());
    }

    /**
     * 미션 목록 조회하기
     * @param request
     * @return
     */
    public List<MissionListResponse> searchList(MissionListSearchRequest request) {
        return null;
    }

    /**
     * 미션 상세 조회하기
     * @param id
     * @return
     */
    public MissionResponse search(Long id) {
        return null;
    }

    // TODO: 미션 수정하기 (카테고리, 상세정보, 파일, 질문)
    // TODO: 미션 수동 삭제(종료)하기 (진행중인 사용자가 있는 경우는 삭제 X)
    // TODO: 미션 자동 종료하기 (진행중인 사용자가 있는 경우는 종료 X)
}
