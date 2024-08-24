# Auth api with spring security + jwt

## Relations
Roles - Users - user_roles
![roles](./roles.png)

## Database init

```sql
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

## Refresh Token
<img src="https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication/raw/master/spring-boot-refresh-token-jwt-example-flow.png">

## API
### Signup
endpoint: `http://localhost:8080/api/auth/signup`
```json
{
  "username": "nhan",
  "email": "aaa@gmail.com",
  "password": "123456",
  "role": ["user"]
}
```

## Signin
- endpoint `http://localhost:8080/api/auth/signin`
- request:
```json
{
  "username":"nhan",
  "password": "123456"
}
```
- response:
```json
{
  "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuaGFuIiwiaWF0IjoxNzI0NDgxNTEwLCJleHAiOjE3MjQ0ODUxMTB9.t5E4_zRq7y2ttL9pQIATB8n1M39-44IVXoaNTSPBw8wSdjLCqHV3aSu2IEgXbLTTEjJ5X2njiMUumjWR68cs8Q",
  "type": "Bearer",
  "refreshToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuaGFuIiwiaWF0IjoxNzI0NDgxNTEwLCJleHAiOjE3MjQ0ODk5MTB9.4b6fR2rdo2rA7d8K8PF1p89EY0ieGLFzYd8OiwprIqJsry1s9SZ5vxN2Ck4nQvs6wufZeTgECgiL-wFXWfd-wg",
  "id": 1,
  "username": "nhan",
  "email": "aaa@gmail.com",
  "roles": [
    "ROLE_USER"
  ]
}
```

## public resource
`http://localhost:8080/api/test/all`

## secure resouce
- send request with valid jwt token `Bearer <token>`

`http://localhost:8080/api/test/users`
`http://localhost:8080/api/test/mod`
`http://localhost:8080/api/test/admin`

## Refresh token
`http://localhost:8080/api/auth/refreshtoken`

```json
{
    "refreshToken": "valid token"
}
```

provided valid refresh token then receive new access token