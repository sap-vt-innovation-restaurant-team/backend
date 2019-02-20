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



### URL

#### GET
```
/order/getAllTags
/order/getAllDishes
/order/getTagsByDishName?dishName=Radler
/order/getDishesByOrderId?orderId=5c6d5efb010b0523a07c7bec
/order/getDishesByName?dishName=Weizenbier
/order/getDishById?dishId=5c6d2c342f26596bdcc0fbf4
/order/getDishesByType?type=Beverage
/order/getDishesByTag?tagName=Icy
/order/getOrdersByUserId?userId=123456
```

#### POST 
```
order/insertOrder
body:
{
	"userid":"123456",
	"dishIds":["5c6d21e42f26596bdcc0fbed"]
}
```
