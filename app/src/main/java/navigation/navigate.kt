package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.compose.Composable
import androidx.navigation.NavHostController
import uia.Home

fun Navigate(){
    val navController:NavHostController = RememberNavController()

    NavHost(
        navController=navController, starDestination = "Home"
    ){
        composable("Home"){
            Home(navController)
        }
    }
}