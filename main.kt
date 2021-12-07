fun main() {
  val startWork = 7;
  val finishedWork = 18;
  val comNd : String
  
  if (startWork > 7) {
    comNd = "Working..!"
  } else if (startWork == finishedWork) {
    comNd = "Finished work!"
  } else {
    comNd = "Enjoy Your Life"
  }

  print(comNd)
}

fun setUser(name: String, age: Int) {
  print ("Hy, name is $name, and i $age yearst old!")
}

fun printGreeting(kata: String) {
  print("$kata semua")
}