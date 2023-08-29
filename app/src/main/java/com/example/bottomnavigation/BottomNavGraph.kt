package com.example.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigation.screen.HomeScreen
import com.example.bottomnavigation.screen.ProfileScreen
import com.example.bottomnavigation.screen.SettingsScreen

@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route){
        composable(Screens.Home.route){
            HomeScreen()
        }
        composable(Screens.Profile.route){
            ProfileScreen()
        }
        composable(Screens.Setting.route){
            SettingsScreen()
        }
    }
}