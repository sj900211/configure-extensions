package run.freshr.common.extensions.unit;

/**
 * 기본 Unit 기능 interface
 *
 * @param <E>  Entity
 * @param <ID> ID 데이터 유형
 * @author FreshR
 * @apiNote Unit 공통 기능을 정의
 * @since 2024. 3. 27. 오후 1:36:48
 */
public interface UnitDefaultExtension<E, ID> {

  /**
   * 등록
   *
   * @param entity Entity
   * @return id
   * @apiNote 데이터 생성
   * @author FreshR
   * @since 2024. 3. 27. 오후 1:36:48
   */
  ID create(E entity);

  /**
   * 데이터 존재 여부
   *
   * @param id 일련 번호
   * @return boolean
   * @apiNote 데이터 존재 여부
   * @author FreshR
   * @since 2024. 3. 27. 오후 1:36:48
   */
  Boolean exists(ID id);

  /**
   * 데이터 조회
   *
   * @param id 일련 번호
   * @return e
   * @apiNote 데이터 조회
   * @author FreshR
   * @since 2024. 3. 27. 오후 1:36:48
   */
  E get(ID id);

}
