# SpringMailSenderDemo
SpringBoot 2.0 에서 Email 보내는 샘플 코드

## Maven
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
```

## 실행을 위한 메일 보안 설정(Gmail 기준)
1. https://myaccount.google.com/ 접속
2. 왼쪽 메뉴에서 보안 클릭
3. 보안 수준이 낮은 앱으이 엑세스에서 사용으로 변경<br/>
※ 테스트 실행 이후에 사용하지 않는다면 엑세스 차단을 권고합니다.

## JavaMailSender 설정
* 위치 : src/resources/application.yml
* 수정할 부분 : spring.mail.host(보내는 메일이 gmail이 아닐 경우 수정), spring.mail.username, spring.mail.password

## 테스트 실행 코드 위치
* src/test/java/com.spring.mail.sender.demo/DemoApplicatioTest.java
* 수정할 부분 : receiverAddr에 메일을 받을 이메일 주소로 수정

## 첨부파일 샘플 위치
* attachment/application.yml


