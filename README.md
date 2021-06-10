# profile-service
The profile service for the fitte frietjes app


## API
service available on port: `8081`

## API docs
API docs available on `http://localhost:8081/swagger-ui.html`

## Routes
### Health Check
GET `http://localhost:8081/`

This base route can be used to check if the API is currently running. If the server is running there should always be a response.

The succesful response will be:

```
{
  "STATUS": "Good to go!"
}
```

### Register a user
POST `http://localhost:8081/users/register`

Body of **request** must be JSON. Sample:
```
{
  "email": "steve@fittefrietjes.com",
  "loginType": "FACEBOOK"
}
```

### Get a list of all users
GET `http://localhost:8081/users/all`

Sample **Response**:

```
[
  {
        "name": "Steve",
        "loginType": "FACEBOOK",
        "email": "steve@fittefrietjes.com",
        "verified": true,
        "accountStatus": "ACTIVE",
        "password": "yaddayadda",
        "id": 1
    },
    {
        "name": "Luke",
        "loginType": "FACEBOOK",
        "email": "luke@fittefrietjes.com",
        "verified": true,
        "accountStatus": "ACTIVE",
        "password": "yaddayadda",
        "id": 2
    }
 ]

```


### Get a specific user
No body required. Id required in the headers. Will get details of specific user, based on the id.

GET `http://localhost:8081/users/:id`

Sample **Response**:
```
{
    "name": "Steve",
    "loginType": "FACEBOOK",
    "email": "steve@fittefrietjes.com",
    "verified": true,
    "accountStatus": "ACTIVE",
    "password": "yaddayadda",
    "id": 1
}
```

## Error Responses
All the errors from the server should return as valid JSON data or TEXT error messages. They will have an HHTP status code of 400. They will have the same data structure in the JSON data or TEXT error message which include ``code`` and ``message`` properties. Sample:

```
ErrorMessage{code=400, message='This email address already exists.'}
```

