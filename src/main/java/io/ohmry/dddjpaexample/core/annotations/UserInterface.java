package io.ohmry.dddjpaexample.core.annotations;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * UserInterface 어노테이션은 {@link RestController}의 역할을 하는 클래스들에 선언하여 사용한다.
 * <p>도메인 주도 개발론에 따른 레이어의 구분에서 UserInterface는 사용자와 직접적으로 소통할 수 있는 영역이며,
 * 이는 API를 요청받고, 응답을 처리하는 {@link RestController}의 영역이라고 할 수 있다.
 *
 * @see org.springframework.stereotype.Component
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@RestController
public @interface UserInterface {
}
