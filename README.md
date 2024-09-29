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

