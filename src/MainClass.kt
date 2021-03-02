class MainClass {
 /*

 abstract Phone {
  private serialNumber: double
  protected ram : Int = 100

  abstract fun call()

  protected fun ring(ringtoneName: String) {
    // implementation
  }

}

 class Android : Phone {

  fun call() {
    \\ fancy call
  }
   fun changeRam() {
    ram = 12

    ring("ding")
   }
 }

 class Apple : Phone {

    val name : String = "xX3000"

     fun call () {
     println("Calling")
    }
    override fun ring(ringtoneName: String) {
     // ringing
    }

    private fun ring(ringtoneName: String, length: Int) {
     // ringing longer
    }
 }

 class Main {

    fun mainMethod() {
       // val phone1 = Phone()
        val android = Android()
        val apple = Apple()

        apple.ring("lol", 12)
        apple.ring("lol")
    }
 }

  */
    companion object {

        private var databaseVar : Database? = null

        @JvmStatic fun main(args: Array<String>) {
           /* var newDatabase = connectToDatabase("New Database")
            if (newDatabase != null) {
                newDatabase.listOfPeople.add(Person("Frankie", 3))
                println("Name: " + newDatabase.name + "\nList has " + newDatabase.listOfPeople.size + " people \nAddress: " + newDatabase)
            }


            println("=================")
            var otherDatabase = connectToDatabase("Other Database") //Redundant code
            //otherDatabase.name = "Other Database"
            if (otherDatabase != null) {
                otherDatabase.listOfPeople.add(Person("Anilde", 49))
                otherDatabase.listOfPeople.add(Person("Sheik", 60))
                println("Name: " + otherDatabase.name + "\nList has " + otherDatabase.listOfPeople.size + " people \nAddress: " + otherDatabase)
            }*/

            println("=================")
            connectToDatabase("Super cool Database!")?.listOfPeople?.add(Person("Anilde", 49))
            var personFound = getPerson(connectToDatabase("New Database"), "anilde")
            println("DatabaseName: " + databaseVar?.name)
            println("Name: " + personFound?.name + " Age: " + personFound?.age)

            val apple = Apple()
            apple.ring("Song", 10)
            apple.ring("Song2")
        }


        private fun connectToDatabase(databaseName: String) : Database? {
            // Update the code/class so that the Database returned is always the same whenever this method is called.

            if (databaseVar == null) {
                databaseVar = Database(databaseName)
            }

            return databaseVar
        }

        private fun getPerson(peopleDatabase: Database?, personName: String) : Person? {
            if(peopleDatabase != null) {
                return peopleDatabase.listOfPeople.find { person -> person.name.equals(personName, true) }
            }
            return null
        }
    }

}