abstract class Phone {

    private val serialNumber = Double

    protected var ram: Int = 100

    abstract fun call()

    protected open fun ring(ringToneName: String) {}
}