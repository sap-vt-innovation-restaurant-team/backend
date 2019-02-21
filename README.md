# backend
backend repo for this project

html+js/vue.js

page: button: "test"

func name() {
	axios.get(url, params)
}

url: http://localhost:12306/user/test?userId='test'
params: id='tester'


frontend http request sent


backend capture http request in the controller



mvn clean install package

1. (macOS & Linux) mongod/
2. java -jar eureka\target\eureka-xfewfewfewa.0.0.snapshot.jar
3. java -jar zuul\target\zuul-xfewaca.0.0.1.snapshot.jar
4. java -jar service-user\service-user-core\target\service-user-core-aceewacecac.0.0.1.snapshot.jar



# API 
## Order & Dish

#### GET
```
10.87.131.170:12306/order/getAllTags
10.87.131.170:12306/order/getAllDishes
10.87.131.170:12306/order/getTagsByDishName?dishName=Radler
10.87.131.170:12306/order/getDishesByOrderId?orderId=5c6d5efb010b0523a07c7bec
10.87.131.170:12306/order/getDishesByName?dishName=Weizenbier
10.87.131.170:12306/order/getDishById?dishId=5c6d2c342f26596bdcc0fbf4
10.87.131.170:12306/order/getDishesByType?type=Beverage
10.87.131.170:12306/order/getDishesByTag?tagName=Icy
10.87.131.170:12306/order/getOrdersByUserId?userId=123456
```

#### POST 
```
10.87.131.170:12306/order/insertOrder
body:
{
	"userid":"123456",
	"dishIds":["5c6d21e42f26596bdcc0fbed"]
}


10.87.131.170:8080/api/getRecommendation
body:
{
	"id":"1"   
	//this is should be the "sid" of dish, "sid" is used to call api of recommendation, which limits the id to be int type.
}
output:
{"ids": ["20", "9", "1", "3", "4"]}

```

## User
#### GET
```
10.87.137.56:12306/user/getUserById?userId=5c6ee0d6484fa34c6ccf32cd
```

#### POST
```
10.87.137.56:12306/user/register
body:
{
	"nickname": "Zoe",
	"email": "123456@sap.com",
	"phoneNumber": "18704284876"
}
```
