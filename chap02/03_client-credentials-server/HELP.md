
- 유저 ID/PW로 액세스 토큰을 요청.
`
curl -X POST --user clientadmin:123456 http://localhost:8203/oauth/token -d "grant_type=client_credentials&scope=admin" 
`
