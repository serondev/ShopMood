# ShopMood ECommerce Application

ShopMood is a mobile shopping application developed for those who love shopping through mobile applications with an orange and purple theme. Clothing, technology, etc. Anyone who aims to shop in areas and has Android operating system devices can benefit from the application.

## GIF
![](https://media.giphy.com/media/BPI4L914dNrncenwgN/giphy.gif)
![](https://media.giphy.com/media/ehOOE4WAp2forEo1KI/giphy.gif)
![](https://media.giphy.com/media/jqnFku3XOVIKiQXlyR/giphy.gif)

## Screenshots
<img src="https://github.com/serondev/ShopMood/blob/main/screenshots/ss1.jpeg" alt="drawing" width="200"/>
<img src="https://github.com/serondev/ShopMood/blob/main/screenshots/ss2.jpeg" alt="drawing" width="200"/>
<img src="https://github.com/serondev/ShopMood/blob/main/screenshots/ss3.jpeg" alt="drawing" width="200"/>
<img src="https://github.com/serondev/ShopMood/blob/main/screenshots/ss4.jpeg" alt="drawing" width="200"/>
<img src="https://github.com/serondev/ShopMood/blob/main/screenshots/ss5.jpeg" alt="drawing" width="200"/>

## Tech Stack
- [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started) - Handle everything needed for in-app navigation. asynchronous tasks for optimal execution.
- [Safe Args](https://developer.android.com/guide/navigation/navigation-pass-data) - For passing data between destinations
- [Dagger Hilt](https://developer.android.com/jetpack/compose/libraries#hilt) - A dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
- [ViewModel](https://developer.android.com/jetpack/compose/state#viewmodel-state) - Easily schedule asynchronous tasks for optimal execution.
- [Retrofit](https://square.github.io/retrofit/) - Retrofit is a REST client for Java/ Kotlin and Android by Square inc under Apache 2.0 license. Its a simple network library that is used for network transactions. By using this library we can seamlessly capture JSON response from web service/web API.
- [OkHttp](https://square.github.io/okhttp/) - Doing HTTP efficiently makes your stuff load faster and saves bandwidth.
- [View Binding](https://developer.android.com/topic/libraries/view-binding) - A feature that allows you to more easily write code that interacts with views.
- [Firebase Authentication](https://firebase.google.com/docs/auth) - Firebase Authentication provides backend services, easy-to-use SDKs, and ready-made UI libraries to authenticate users to your app. It supports authentication using passwords, phone numbers, popular federated identity providers like Google, Facebook and Twitter, and more.
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore)
- [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - The Paging Library makes it easier for you to load data gradually and gracefully within your app's RecyclerView.
- MVVM with Clean Architecture

## API Usage

#### Get Products

```http
  GET /products
```

| Parametre | Tip     | Açıklama                |
| :-------- | :------- | :------------------------- |
| `id` | `string` | https://fakestoreapi.com/products |

#### Get a product

```http
  GET /products/1
```

| Parametre | Tip     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | https://fakestoreapi.com/products/1 |


  ## Color Reference

| Renk             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| custom_color_primary | ![#0a192f](https://via.placeholder.com/10/643ae7?text=+) #643AE7 |
| custom_color_secondary | ![#f8f8f8](https://via.placeholder.com/10/ff8f00?text=+) #FF8F00 |
| custom_color_secondary_light | ![#00b48a](https://via.placeholder.com/10/ffd299?text=+) #FFD299 |
| custom_color_background | ![#00d1a0](https://via.placeholder.com/10/ffffff?text=+) #FFFFFF| 

## Developed For

- This application developed as final project of Pazarama Android & Kotlin Bootcamp.
  
## Communication

For any feedback please send an email to serondev@hotmail.com
- [Linkedin](https://www.linkedin.com/in/serkanönder/)
  

### Thanks to

- [@merttoptas](https://github.com/merttoptas) for his labor.
- [unDraw.co](https://undraw.co) for all the .svg files.
