package com.oceanbrasil.android.glidenretrofit

/*
{
    "name": "2TJDF_2019_IA_MaquinaEstado",
    "owner": {
      "login": "paulosalvatore",
      "avatar_url": "https://avatars.githubusercontent.com/u/7906171?v=4",
    },
  }
 */

data class Repo (
    val name: String,
    val owner: Owner
)

data class Owner (
    val login: String,
    val avatar_url: String
)
