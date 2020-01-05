- 아래 명령어를 브라우저에서 실행시켜 코드를 획득.

`
curl -X GET http://dandi:dandi@localhost:8202/oauth/authorize?client_id=clientapp&redirect_uri=http://localhost:8202/callback&response_type=token&scope=read_profile&state=xyz
`
