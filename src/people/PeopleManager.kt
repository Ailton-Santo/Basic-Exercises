package people

class PeopleManager {

    companion object {
        public var version: String = "2.9.8"
    }

    public fun getVersion(): String {
        return version
    }
    public var databaseVar : Database? = null

    public fun connectToDatabase(databaseName: String) : Database? {
        // Update the code/class so that the People.Database returned is always the same whenever this method is called.
        if (databaseVar == null) {
            databaseVar = Database(databaseName)
        }

        return databaseVar
    }

    public fun getPerson(peopleDatabase: Database?, personName: String) : Person? {
        if(peopleDatabase != null) {
            return peopleDatabase.listOfPeople.find { person -> person.name.equals(personName, true) }
        }
        return null
    }

}