package phone

abstract class Phone : Device {

    private val serialNumber : Double? = null

    protected var ram: Int = 100

    abstract fun call()

    protected open fun ring(ringToneName: String) {}

    override fun turnOn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}