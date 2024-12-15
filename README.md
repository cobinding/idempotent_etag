## Single Edit Menu Store
- 사용자가 메뉴 항목을 한 번 수정하면, **동일한 메뉴에 대한 후속 수정 요청을 막아 멱등성을 보장**하는 RESTful API를 구현합니다.
- 사용자가 실수로 같은 메뉴를 여러 번 수정하는 것을 방지할 수 있습니다.

<img src="https://private-user-images.githubusercontent.com/102461290/395853611-9a056c86-5ea3-450c-bfc2-2611e2b718f5.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzQyNTc2NDAsIm5iZiI6MTczNDI1NzM0MCwicGF0aCI6Ii8xMDI0NjEyOTAvMzk1ODUzNjExLTlhMDU2Yzg2LTVlYTMtNDUwYy1iZmMyLTI2MTFlMmI3MThmNS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjE1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIxNVQxMDA5MDBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lMGFjMzQ2MWUwYzExZmY4NWVjYTU1YTg0YzEzMTk1NjAwODZjMjU2ZTBjOGQzMDE4MGFkMDdmNTVkODJiMGZmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.-If5G98UOBAaFx1t8YeZtNLFlpGOc9EQxGzMrBKexug" 
  alt="SEMS 이미지" width="600"/>


## API 목록
1. 메뉴 목록 조회
2. 메뉴 ID 조회
3. 메뉴 추가
4. 메뉴 ID를 통한 Name 수정 🌟
5. 메뉴 삭제 
