- 아래 명령어를 브라우저에서 실행시켜 코드를 획득.

`
curl -X GET http://dandi:dandi@localhost:8205/oauth/authorize?client_id=clientapp&response_type=code
`

- 인가 코드로 액세스 토큰을 요청.
`
curl -X POST --user clientapp:123456 http://localhost:8205/oauth/token \
-d "code=DIGUin&grant_type=authorization_code&redirect_uri=http://localhost:8205/callback&scope=read_profile" \
-H "Content-Type: application/x-www-form-urlencoded"
`
