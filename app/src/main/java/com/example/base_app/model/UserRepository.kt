package com.example.base_app.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend  fun fetchUserData() : UserData{
        delay(2000)
      return UserData("Soumya",23)
    }
}

// this function fetchuser return the data from either local or remote source
// when it comes to suspend function it will covers the couroutines