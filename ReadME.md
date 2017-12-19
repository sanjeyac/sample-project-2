This is a sample project made to understand some concept of DDD in Spring Web Application

The purpose of this project is too put together several tips and tricks
a simple coding style to make the code easy to read and extend.

Context:
This a order management scenario.

An order has several OrderItems.
Each OrderItem has a Product, a cost and a quantity.
Each Product has a code and a description.

    +---------+        +-------------+        +-----------+
    |         |        |             |        |           |
    |  Order  +<-------+  OrderItem  |<-------|  Product  |
    |         |        |             |        |           |
    +---------+        +-------------+        +-----------+


For learning puposes package are name by layers and code is design in this way:
 
		    +------------------+
		 ^  |                  |
	Data     |  |   Presentation   |
	used as  |  |                  |
	Dto      |  +------------------+
	Objects	 |
		 v  +------------------+
		    |                  |
	+-----------+      Service     +---------+
		    |                  |
		 ^  +------------------+
		 |
	Data     |  +------------------+
	used as  |  |                  |
	Domain   |  |      Domain      |
	Objects	 |  |                  |
		 v  +------------------+


In code is written in this way:

- A Web controller exposes Product as a ProductDto
- A Product Service persists and restrives data through a Product Repository
- A ProductAdapter converts an Entity to a Dto and a DTO to an Entity

Note: 	Only the service layer uses the domain models.
	Service exposes data only as DTO objects, in this way controller 
	can be decuopled from domain objects 
	and DTO can be created based on presentation layer needs
	


