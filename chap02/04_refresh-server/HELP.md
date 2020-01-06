
- 유저 ID/PW로 액세스 토큰을 요청.
`
curl -X POST --user clientapp:123456 http://localhost:8204/oauth/token -d "grant_type=client_credentials&scope=read_profile" 
`

`
curl -X GET http://localhost:8204/api/profile -H "authorization: BearerTOKEN"
`
