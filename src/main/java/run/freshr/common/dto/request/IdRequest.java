package run.freshr.common.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PK request DTO
 *
 * @param <ID> ID 데이터 유형
 * @author FreshR
 * @apiNote 요청 데이터에 id 만 있는 경우 공통으로 사용하는 Request DTO<br>
 *          자주 사용하는 구조기때문에 공통으로 생성
 * @since 2024. 3. 27. 오전 10:06:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdRequest<ID> {

  /**
   * Id
   *
   * @apiNote 일련 번호
   * @since 2024. 3. 27. 오전 10:06:24
   */
  @NotNull
  private ID id;

}
