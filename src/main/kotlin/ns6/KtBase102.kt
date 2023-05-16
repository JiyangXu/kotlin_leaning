package ns6

abstract class BaseActivity {
    fun onCreate() {
        setContentView(getLayoutID())
        initView()
        initData()
    }

    private fun setContentView(layoutID: Int) = println("laoding ${layoutID} in xml")
    abstract fun getLayoutID(): Int
    abstract fun initView()
    abstract fun initData()
}

class MainActivity : BaseActivity() {
    override fun getLayoutID(): Int = 23

    override fun initView() = println("for init details")

    override fun initData() = println("init data implement")

    fun show() {
        super.onCreate()
    }

}

//TODO : 102 Kotlin abstract class
// 1.
fun main() {
    MainActivity().show()
}
