package kr.hanbee.townmission.dto;

import kr.hanbee.townmission.constant.common.StatusType;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpStatus.OK;

@Getter
@Builder
public class CommonResponse {

    private static final String EMPTY = "";

    // private final int status;
    private final String message;
    private final Object data;

    public static ResponseEntity<CommonResponse> ok() {
        return ok(EMPTY);
    }

    public static ResponseEntity<CommonResponse> ok(Object data) {
        return new ResponseEntity<>(makeSuccessBody(data), OK);
    }

    private static CommonResponse makeSuccessBody(Object data) {
        return CommonResponse.builder()
                .message(StatusType.OK)
                .data(data)
                .build();
    }
}
