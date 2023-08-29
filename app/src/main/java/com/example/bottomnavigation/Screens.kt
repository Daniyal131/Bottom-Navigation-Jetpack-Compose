package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    object Home : Screens(
        route = "home_screen",
        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Profile : Screens(
        route = "favourite_screen",
        title = "Profile",
        icon = Icons.Outlined.AccountCircle
    )

    object Setting : Screens(
        route = "notification_screen",
        title = "Settings",
        icon = Icons.Outlined.Settings
    )

}
