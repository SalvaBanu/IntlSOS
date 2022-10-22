
## Rest API EndPoint

#### Get all Doctors

```http
  GET http://localhost:8080/doctors
```
#### Get all Patients

```http
  GET http://localhost:8080/patients
```

#### Insert Single Record in doctor table

```http
  POST http://localhost:8080/doctors
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `doctorId`      | `int` | **Required**. |
| `firstName`      | `string` | **Required**. |
| `lastName`      | `string` | **Required**. |
| `age`      | `int` | **Optional**. |
| `department`      | `string` | **Required**. |

#### REQUEST BODY EXAMPLE
```json
{	
	 "doctorId":1,
	 "firstName":"devi",
	 "age":"22",
	 "lastName":"F",
	 "department":"Ortho"
}

```
#### Insert Single Record in patient table

```http
  POST http://localhost:8080/patients
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `doctorId`      | `int` | **Required**. |
| `patientId`      | `int` | **Required**. |
| `patientName`      | `string` | **Required**. |
| `gender`      | `string` | **Required**. |
| `age`      | `int` | **Optional**. |
| `phoneNumber`      | `string` | **Optional**. |

#### REQUEST BODY EXAMPLE
```json
{
	 "patientId": 1,	
	 "doctorId":1,
	 "patientName":"devi",
	 "age":"22",
	 "gender":"F",
	 "phoneNumber":"9878765676"
}

```

#### Update Single Record in doctor table

```http
  PUT http://localhost:8080/doctors/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `firstName`      | `string` | **Optional**. |
| `lastName`      | `string` | **Optional**. |
| `age`      | `int` | **Optional**. |
| `department`      | `string` | **Optional**. |


#### Update Single Record in patient table

```http
  PUT http://localhost:8080/patients/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `doctorId`      | `int` | **Optional**. |
| `patientName`      | `string` | **Optional**. |
| `gender`      | `string` | **Optional**. |
| `age`      | `int` | **Optional**. |
| `phoneNumber`      | `string` | **Optional**. |


#### Delete Single Record in doctor table

```http
  DELETE http://localhost:8080/doctors/{id}
```

#### Delete Single Record in patient table

```http
  DELETE http://localhost:8080/patients/{id}
```
