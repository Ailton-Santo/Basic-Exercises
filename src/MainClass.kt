import people.PeopleManager
import people.Person

class MainClass {
 /*


  */
    companion object {


        @JvmStatic fun main(args: Array<String>) {


            val peopleManager = PeopleManager()
            peopleManager.connectToDatabase("Super cool People Database!")?.listOfPeople?.add(Person("Anilde", 49))

            var personFound = peopleManager.getPerson(peopleManager.connectToDatabase("New People.Database"), "anilde")
            println("DatabaseName ${peopleManager.databaseVar?.getName()}")
            peopleManager.databaseVar?.setName("rrrt")
            println("Name: ${personFound?.name} Age: ${personFound?.age}")

            println("=================")
            println("New DatabaseName is: ${peopleManager.databaseVar?.getName()}")

            println("=================")
            println(PeopleManager.version)

            println("PeopleManager instance version: ${peopleManager.getVersion()}")

            PeopleManager.version = "2"

            println("PeopleManager instance version: ${peopleManager.getVersion()}")
        }

    }

}