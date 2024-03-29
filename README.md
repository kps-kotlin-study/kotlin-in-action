# agit
-- --
아지트 프로젝트

## Structure
-- --
```bash
 agit
   ├-- agit-common
```

## Using docker for infrastructure
-- --
### Run MySql
```bash
$ cd docker
$ docker-compose up -d
```

## DB migration
-- --
### Support tasks
* flywayMigrate
* flywayClean
* flywayBaseline
* flywayInfo
* flywayValidate

### Usage
```bash
$ cd $PROJECT_DIR
$ ./gradlew -Dflyway.configFiles=flyway/configs/local.conf flywayMigrate
```

## Test
-- --
```bash
./gradlew test
./gradlew :agit-common:test
```

## 실행
-- --
```bash
./gradlew :agit-common:bootRun --args='--spring.profiles.active=local'
```

## ktlint
-- --
### (설정필수)Intellij code style 설정
Intellij code style 설정을 ktlint의 규칙과 맞도록 설정.
```bash
$ cd $PROJECT_DIR
$ ./gradlew ktlintApplyToIdea
```
### (설정필수)git commit hook 설정
git 커밋시 ktlintCheck를 수행한다.
```bash
$ cd $PROJECT_DIR
$ ./gradlew addKtlintCheckGitPreCommitHook
```
### code style check
code style 체크. build task에 연결되어있어서 build task 수행시 code style이 맞지 않으면 빌드 실패
```bash
$ cd $PROJECT_DIR
$ ./gradlew ktlintCheck
```
### 일괄 변환
코드를 일괄 변환 해주는 task. 필요할 때 만 실행 하고 실행 후 삭제 되는 파일이 없는지 확인 필요
```bash
$ cd $PROJECT_DIR
$ ./gradlew ktlintFormat
```

## Swagger
-- --
### [Swagger URL](http://localhost:8080/swagger-ui/index.html)
```bash
http://localhost:8080/swagger-ui/index.html
```

## QueryDsl 사용
-- --
### QClass 파일 만들기
```bash
$ ./gradlew :agit-common:clean :agit-common:compileKotlin
```
