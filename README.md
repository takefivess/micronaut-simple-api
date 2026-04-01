# Micronaut Simple API

간단한 REST API를 Micronaut으로 구현한 프로젝트입니다.

## 요구사항
- Java 17 이상
- Maven 3.6.0 이상

## 빌드

```bash
mvn clean package
```

## 실행

```bash
java -jar target/micronaut-simple-api-1.0.0.jar
```

## API 엔드포인트

### 1. 간단한 인사
```bash
curl http://localhost:8080/api/hello
```

응답: `Hello, Micronaut!`

### 2. 이름을 포함한 인사
```bash
curl http://localhost:8080/api/hello/takefivess
```

응답: `Hello, takefivess!`

### 3. POST 요청 - 메시지 전송
```bash
curl -X POST http://localhost:8080/api/greet \
  -H "Content-Type: text/plain" \
  -d "Hello World"
```

응답: `You said: Hello World`

### 4. JSON 응답
```bash
curl http://localhost:8080/api/json
```

응답:
```json
{
  "name": "John Doe",
  "age": 30
}
```

## 주요 기능
- ✅ GET 요청 처리
- ✅ POST 요청 처리
- ✅ 경로 파라미터 처리
- ✅ JSON 응답
- ✅ 가벼운 성능 (Micronaut)

## 다음 단계
- 데이터베이스 연동
- 인증/인가 추가
- 더 복잡한 비즈니스 로직 구현