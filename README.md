# 동네 미션 개인 프로젝트
구인자가 미션을 등록하고 구직자가 미션을 수행하며 포인트를 얻는 서비스

- Java 11
- Gradle
- MySQL

## 프로젝트 구성

## Swagger 3.0 설정하기
- build.gradle 파일에 라이브러리 추가
```
...

ext {
    swaggerVersion = '3.0.0'
    openApiVersion = '1.5.8'
}

...

dependencies {
    ...
    
    // swagger
    implementation "io.springfox:springfox-swagger2:${swaggerVersion}"
    implementation "io.springfox:springfox-swagger-ui:${swaggerVersion}"
    implementation "org.springdoc:springdoc-openapi-ui:${openApiVersion}"
    
    ...
}
```
- SwaggerConfig.java 파일 추가 (설정 정보 변경)
- 서버 실행 후 http://localhost:9090/app/swagger-ui.html 접속

## Error
- @DataJpaTest DataSource 설정 오류 (https://charliezip.tistory.com/21)