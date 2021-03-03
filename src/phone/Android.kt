package phone

class Android : Phone() {

    override var model = "0.4"

    override fun call() {
        println("Calling Phone.Android")
    }

    fun changeRam () {
        ram = 12
    }

    fun ring () {

    }
}