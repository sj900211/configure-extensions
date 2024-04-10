package run.freshr.common.dto.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import run.freshr.common.dto.response.IdResponse;

/**
 * String PK DTO
 *
 * @author FreshR
 * @apiNote 필드 이름이 id 인 경우 공통으로 사용하기 위한 반환 모델로 {@link IdResponse} 를 만들었지만<br>
 *          Generic 으로 선언한 경우 ModelMapper 에서 변환이 되지 않아 객체가 null 로 반환되는 것을 확인 및 검증<br>
 *          Long, String 두 가지 유형의 DTO 를 생성해서 사용하는 것으로 현상은 해결<br>
 *          다른 유형이 더 필요한 경우 서비스 프로젝트에서 직접 생성해서 사용
 * @since 2024. 3. 27. 오전 10:06:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdStringData {

  private String id;

}
