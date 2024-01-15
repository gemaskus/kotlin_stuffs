package grant.maskus.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.util.Log

class MainActivity : AppCompatActivity() {
    private var tvInputField :TextView? = null
    private var btn1 :Button? = null
    private var btn2 :Button? = null
    private var btn3 :Button? = null
    private var btn4 :Button? = null
    private var btn5 :Button? = null
    private var btn6 :Button? = null
    private var btn7 :Button? = null
    private var btn8 :Button? = null
    private var btn9 :Button? = null
    private var btn0 :Button? = null
    private var btnDivide :Button? = null
    private var btnPlus :Button? = null
    private var btnMinus :Button? = null
    private var btnMult :Button? = null
    private var btnEqual :Button? = null
    private var btnCLR :Button? = null
    private var value1 :Long = 0
    private var value2 :Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInputField = findViewById(R.id.tvInput)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn9 = findViewById(R.id.button9)
        btn0 = findViewById(R.id.buttonZero)
        btnDivide = findViewById(R.id.buttonDivide)
        btnPlus = findViewById(R.id.buttonPlus)
        btnMinus = findViewById(R.id.buttonMinus)
        btnMult = findViewById(R.id.buttonMult)
        btnEqual = findViewById(R.id.buttonEquals)
        btnCLR = findViewById(R.id.buttonCLR)


        btn1?.setOnClickListener {
            btn1?.let {
                onDigit(btn1?.text.toString())
            }
        }
        btn2?.setOnClickListener {
            btn2?.let {
                onDigit(btn2?.text.toString())
            }
        }
        btn3?.setOnClickListener {
            btn3?.let {
                onDigit(btn3?.text.toString())
            }
        }
        btn4?.setOnClickListener {
            btn4?.let {
                onDigit(btn4?.text.toString())
            }
        }
        btn5?.setOnClickListener {
            btn5?.let {
                onDigit(btn5?.text.toString())
            }
        }
        btn6?.setOnClickListener {
            btn6?.let {
                onDigit(btn6?.text.toString())
            }
        }
        btn7?.setOnClickListener {
            btn7?.let {
                onDigit(btn7?.text.toString())
            }
        }
        btn8?.setOnClickListener {
            btn8?.let {
                onDigit(btn8?.text.toString())
            }
        }
        btn9?.setOnClickListener {
            btn9?.let {
                onDigit(btn9?.text.toString())
            }
        }
        btn0?.setOnClickListener {
            btn0?.let {
                onDigit(btn0?.text.toString())
            }
        }
        btnDivide?.setOnClickListener {
            btnDivide?.let {
                onOperator(btnDivide?.text.toString())
            }
        }
        btnPlus?.setOnClickListener {
            btnPlus?.let {
                onOperator(btnPlus?.text.toString())
            }
        }
        btnMult?.setOnClickListener {
            btnMult?.let {
                onOperator(btnMult?.text.toString())
            }
        }
        btnMinus?.setOnClickListener {
            btnMinus?.let {
                onOperator(btnMinus?.text.toString())
            }
        }
        btnCLR?.setOnClickListener {
            btnCLR?.let {
                onClear()
            }
        }

    }

    fun onDigit(buttonValue: String){
        println("onDigit: received: $buttonValue")
        var temp :String? = null
        tvInputField?.let {
             temp = tvInputField?.text.toString()
        }

        if (temp?.length!! <= 11) {
            tvInputField?.let {
                if (tvInputField?.text?.toString().equals("0")) {
                    tvInputField?.text = buttonValue
                } else {
                    tvInputField?.append(buttonValue)
                }
            }
            println("onDigit: appending... at length ${temp!!.length}")
            value1 = temp!!.toLong()!!
            println(value1)
        }else{
            println("value length too long for screen.")
        }
    }

    fun onOperator(buttonValue: String){
        

    }

    fun onEquals(buttonValue: String){

    }

    fun onClear(){
        tvInputField?.text = "0"
        value1 = 0
        value2 = 0
    }
}
