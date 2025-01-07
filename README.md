### 문제: 로그 분석기

#### 문제 설명
로그 파일에서 특정 조건에 따라 데이터를 처리하는 프로그램을 작성하세요. 주어진 로그 파일 형식에서 사용자별로 발생한 이벤트 수를 세고, ERROR 메시지가 3번 이상 발생한 사용자를 출력하세요.

#### 로그 파일 형식
로그 파일은 아래와 같은 형식으로 주어집니다:

```
2024-12-01 12:00:00 INFO User123 Logged in
2024-12-01 12:05:00 ERROR User123 Connection failed
2024-12-01 12:10:00 INFO User456 Logged in
2024-12-01 12:15:00 ERROR User123 Connection failed
2024-12-01 12:20:00 ERROR User123 Connection failed
2024-12-01 12:25:00 INFO User789 Logged in
```

#### 요구 사항
- 주어진 로그에서 **사용자별**로 발생한 `INFO`와 `ERROR` 메시지의 수를 세고 출력하세요.
- `ERROR` 메시지가 **3번 이상** 발생한 사용자만 별도로 출력하세요.

#### 입력 형식
- 첫 번째 줄에는 로그의 개수 `N`이 주어집니다. (1 ≤ N ≤ 100)
- 그 다음 `N`개의 줄에 로그 데이터가 주어집니다. 각 로그는 `로그 시간`, `로그 수준`, `사용자 ID`, `메시지`로 구성됩니다.

#### 출력 형식
- 각 사용자의 `INFO`와 `ERROR` 메시지 수를 출력합니다.
  - 출력 형식: `UserID: INFO=INFO_COUNT, ERROR=ERROR_COUNT`
- `ERROR` 메시지가 3번 이상 발생한 사용자들은 별도로 출력합니다.
  - 출력 형식: `Users with 3+ errors: UserID1, UserID2, ...`

#### 예시 입력 1
```
6
2024-12-01 12:00:00 INFO User123 Logged in
2024-12-01 12:05:00 ERROR User123 Connection failed
2024-12-01 12:10:00 INFO User456 Logged in
2024-12-01 12:15:00 ERROR User123 Connection failed
2024-12-01 12:20:00 ERROR User123 Connection failed
2024-12-01 12:25:00 INFO User789 Logged in
```

#### 예시 출력 1
```
User123: INFO=1, ERROR=3
User456: INFO=1, ERROR=0
User789: INFO=1, ERROR=0
Users with 3+ errors: User123
```

#### 예시 입력 2
```
5
2024-12-01 12:00:00 INFO User123 Logged in
2024-12-01 12:05:00 ERROR User123 Connection failed
2024-12-01 12:10:00 INFO User456 Logged in
2024-12-01 12:15:00 ERROR User789 Connection failed
2024-12-01 12:20:00 INFO User123 Logged out
```

#### 예시 출력 2
```
User123: INFO=2, ERROR=1
User456: INFO=1, ERROR=0
User789: INFO=0, ERROR=1
Users with 3+ errors: 
```

#### 제한 사항
- 각 로그 항목은 한 줄에 제공되며, 각 항목은 공백으로 구분됩니다.
- 로그의 개수 `N`은 1 이상 100 이하입니다.