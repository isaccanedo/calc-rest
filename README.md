# calc-rest-api-sample
para fins de teste. Uma calculadora simples (REST API) 

Addition

[GET] : api/calc/add
  * Parameter
	-firstNumber
	-secondNumber
	
	
  * Examples
	api/calc/add?firstNumber=5&secondNumber=3
	```
	{
		"firstNumber":5,
		"secondNumber":3,
		"answer":8,
		"operator":"+"
	}
	``` 

[PUT] : api/calc/add
```
  * Header
	key: Content-Type,
	value: application/json
  * Body
	JSON - Example
	{
		"firstNumber":11,
		"secondNumber":4,
	}
	```

  * Result
	```
	{
		"firstNumber":11,
		"secondNumber":4,
		"answer":15,
		"operator":"+"
	}
```
