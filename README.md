# GA&ME


Overview

Description


A student built game site as a class project that features the latest games, and personalized functionality if user makes



App Evaluation

JAM.fig contains the Figma wireframe.


Category: Ecommerce/ Video Game
=======


Story: Allows users to view the latest games and make purchases of games at fair industry prices/

Market: Any individual could choose to use this app but to make a purchase user has to be at least 13 years old.

Habit: This app could be used as often or unoften as the user wanted depending on how much they look to purchase new video games.

Scope: First we create a generalized game app which has access to all games and prices and then it could evolve into allowing the user to filter and search for a game depending on certain filters.

Product Spec

1. User Stories (Required and Optional)


Required Must-have Stories

User must be able to see all games on home page when website is created

User must be able to register for an account for personalized experience

User should be able to login with account creds once created

User can click on game and get a personalized page about specific game

User should be able to updated account details

Purchase page need for when user plans to by game

Cart Page where all user games for purchase are added


Optional Nice-to-have Stories

Search Engine where user can search for game by string of chars

Filtering games by genre


Profile page customization


2. Screens

Home page
users sees all games currently available and has the ability to add them to cart
Login
Register - User signs up or logs into their account

Individual Game Screen - Info about Game user clicked on
Upon selecting game choice user will see more info about game
Profile Screen
Allows user to upload a photo and fill in information that is interesting to them and others

Cart page
show user current items in cart and allows them to make a purchase

Purchase page
shows user items in cart as well as total of the items they are about to buy


[BONUS] Digital Wireframes & Mockups![](blob/main/mockup.jpeg)

### Models
![models](https://user-images.githubusercontent.com/61095672/142090912-02ec5e7f-4f33-47ba-b00c-0781705a76ac.PNG)


### Networking
> List of network requests by screen:

- Home Feed Screen
```
(READ/GET) Query all videos games 
```

- Register Screen
```
(Create/POST) Create a new User Object
```

- Login Screen
```  
(READ/GET) Get User Profile
```

- Individual Game Page
```
(READ/GET) Get specific game and data asscoiated with it
```

- Profile Screen
``` 
(Read/GET) Query logged in user object
(Update/PUT) Update user profile image
(Update/PUT) Update user profile info
```

- Cart Screen 
``` 
(Read/GET) All selected video games
```

- Payment Page
```
(Create/POST) Create user Purchase Order object
```

[IF EXISTS:] 
```
Existing API Endpoints
An API Of   Video Game Database
Base URL - https://api.igdb.com/v4/

HTTP Verb	Endpoint	Description
GET	       /games	        get a list of video games
GET	       /keywords	return list of video games by keyword
GET	       /search	        search for video game

```

