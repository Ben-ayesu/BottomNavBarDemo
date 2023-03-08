package com

sealed class NavRoutes(val route: String) {
    object Home: NavRoutes("home")
    object Contacts: NavRoutes("contacts")
    object Favourites: NavRoutes("favourites")
}
