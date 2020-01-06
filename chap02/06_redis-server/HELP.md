
- 인가 코드로 액세스 토큰을 요청.
`
curl -X POST --user clientapp:123456 http://localhost:8206/oauth/token \
-d "grant_type=password&username=dandi&password=dandi&scope=read_profile" \
-H "Content-Type: application/x-www-form-urlencoded" \
-H "Accept: application/json"
`
