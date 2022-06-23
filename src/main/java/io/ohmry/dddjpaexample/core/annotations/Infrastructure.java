package io.ohmry.dddjpaexample.core.annotations;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Infrastructure 어노테이션은 JPA에서 {@link Repository} 역할을 하는 인터페이스에 선언하여 사용한다.
 * <p>도메인 주도 개발론에 따른 레이어의 구분에서 Infrastructure는 서비스 로직을 벗어나
 * RDBMS, ORM 등의 영역을 처리하는 부분으로 JPA에서는 DB에 데이터를 반영하는 {@link Repository} 라고 할 수 있다.
 */
@Repository
public @interface Infrastructure {
}
