package people

class Database (private var name: String) {
    val listOfPeople : ArrayList<Person> = ArrayList()

    public fun getName() : String {
        return name
    }

    public fun setName(name: String) {
       // if(name.startsWith("po", true)) {
            this.name = name
       // }
    }
}