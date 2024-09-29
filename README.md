# 🎓 네팔 학교 학사행정관리 시스템

- 배포 URL : http://www.cla-school.site/

## 프로젝트 소개
  - ‘2023 월드프렌즈코리아 온라인 IT봉사단’으로 활동 중 네팔 Thimi 지역의 중등학교인 Creative Learners’Academy와 인연을 맺었습니다.
  - IT 인프라 부족 및 경제적 제약 등으로 자체 웹사이트 개발이 힘든 학교에 보안이 강화된 디지털 학사 행정 시스템 제공하였습니다.

## 🎥 시연영상
[![네팔 학교 학사행정관리 시스템 시연영상](https://img.youtube.com/vi/UAfsIZcydPI/0.jpg )](https://www.youtube.com/watch?v=UAfsIZcydPI)

## 팀원 구성
|김나경|윤재원|박지연|박준형|
|------|---|---|---|
|프론트|프론트|백엔드|벡엔드|

## 1. 개발 환경

### 웹 개발
- **React (18.2.0)**: 웹 개발 라이브러리
- **Web Speech API**: 브라우저 엔진 내장 기능을 이용한 텍스트 음성 변환 기능

### 서버 애플리케이션 개발
- **Spring Boot (3.1.11)**: REST API 서버 구축
- **Free-Translate API**: 오픈소스 API를 이용한 Translation 서버 구축
- **MySQL (8.0.39)**: 웹 사이트 데이터를 관리하는 데이터베이스
- **Tomcat (10.1.20)**: 웹 페이지를 구동하는 웹 서버

### 서버 운영체제
- **리눅스 Ubuntu 22.04.4**
- **Putty**: 클라우드 서버 Ubuntu 원격 접속용 툴
- **Docker**: 리눅스 컨테이너 툴

### CI/CD
- **Github Actions**: 코드 통합 및 배포 자동화 파이프라인 툴
- **AWS S3**: 빌드된 application 저장소
- **AWS CodeDeploy**: S3에 저장된 빌드 결과물을 라즈베리파이 서버에 배포

### 스마트폰 App 개발
- **Android Studio (2022.3.1)**: Android application 프로그램 개발
- **안드로이드 OS (11.0)**: 스마트폰 운영체제

## 2. 개발 기간 및 작업 관리
### 개발 기간
- 전체 프로젝트 진행 기간 : 2024-04 ~ 2024-08
- 기획 기간 : 2024-04 ~ 2024-06
- 개발 기간 : 2024-06 ~ 2024-08

### 3. 작업 관리
- 프로젝트 관리 : Jira에서 기간별 Sprint를 생성하여 작업을 할당 및 공유하여 관리하였습니다.
- 형상 관리 : Git Flow의 브랜치 전략을 채택하여 Github로 관리하였습니다.
- 이슈 관리 : 주간회의를 진행하며 Confluence에 회의록을 작성하였으며 파트별 주간 Wiki를 작성하여 이슈를 공유하였습니다.

### 3. 시스템 아키텍처
<img width="498" alt="image" src="https://github.com/user-attachments/assets/d5dd3f57-6d41-4a94-b066-1ef715c01ed3">

### 4. 화면별 기능
### [로그인]
학생들의 접근 편이성을 위하여 PC 웹사이트와 모바일 어플 모두 동시에 지원합니다.

|로그인 웹|
|------|
|![로그인](https://github.com/user-attachments/assets/e5e4aa94-8e87-459c-8c23-a46b1b391da2)|

|로그인 앱|
|------|
|![로그인_앱](https://github.com/user-attachments/assets/a9b1d747-ad66-4a58-b5f5-ca622aea9979)|

### [홈 화면 (학사일정 캘린더)]
네팔의 교장 선생님 Google Calendar 계정과 연동된 서비스를 제공하여 
학사 일정을 효율적으로 관리할 수 있도록 돕습니다.
 
|홈 화면|
|------|
|![홈화면_최종](https://github.com/user-attachments/assets/7eb661f1-0cb3-4b7c-bc1d-a5e08d1663a9)|

### [공지 게시판]
영유아부터 초등학생까지 다양한 연령대의 학생들을 위한 특별한 기능 2가지를 소개합니다.
네팔 언어 번역을 위한 다국어 지원 / 텍스트 읽어주기 (Text-to-Speech) 기능 지원


|공지 게시판|
|------|
|![공지2](https://github.com/user-attachments/assets/bd892c45-5631-4d3a-9d74-5177f3392600)|


## [학생 조회]
수기로 관리하던 학생 명부를 디지털화하였습니다.
온라인으로 학생 프로필을 관리하고 엑셀 파일로 내보내는 기능을 지원합니다.

|학생 조회|
|------|
![학생조회2](https://github.com/user-attachments/assets/203b4ce0-9e15-4517-80fc-f2b3174b0fe1)

## [반 배정]
학급, 담임 교사, 학생을 그룹별로 구성하여 체계적인 학급 관리가 가능하며, 반배정도 쉽게 할 수 있습니다.

|반 배정|
|------|
|![반배정2](https://github.com/user-attachments/assets/bcd1cc09-8c4c-4416-9617-ed7b76c30639)|






