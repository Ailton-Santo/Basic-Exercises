package phone

class Apple : Phone()  {
    val lol: Char = '3'

    override var model = "10.4"

    override fun call() {
        println("Calling Phone.Apple")
    }

     fun ring (ringtoneName: String, length: Int) {
        println("Ringing longer")

    }

    public override fun ring (ringToneName: String) {
        println("Overriding ring fun from Phone.Phone Class")
    }
}