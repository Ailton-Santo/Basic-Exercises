class Apple : Phone()  {
    override fun call() {
        println("Calling Apple")
    }

     fun ring (ringtoneName: String, length: Int) {
        println("Ringing longer")

    }

    public override fun ring (ringToneName: String) {
        println("Overriding ring fun from Phone Class")
    }
}