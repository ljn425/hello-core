package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( 
        // basePackages = "hello.core",    // 탐색할 패키지의 시작 위치를 지정, 이 패키지를 포함해서 하위 패키지를 모두 탐색,
        // 위와 같이 basePackages 를 지정해도 되지만 @ComponentScan 의 기본 값으로 @ComponentScan 이 등록된 클래스의 패키지를 포함해서 하위 패키지 모두를 탐색하기때문에 생략 가능
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
