- 아래 명령어를 브라우저에서 실행시켜 코드를 획득.

`
curl -X GET http://dandi:dandi@localhost:8207/oauth/authorize?client_id=8e5cd6e6-eab6-45d8-a153-d902364b0a69&response_type=code
`

- 인가 코드로 액세스 토큰을 요청.
`
curl -X POST --user 8e5cd6e6-eab6-45d8-a153-d902364b0a69:123456 http://localhost:8207/oauth/token \
-d "code=DIGUin&grant_type=authorization_code" \
-H "Content-Type: application/x-www-form-urlencoded"
`
