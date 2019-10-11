package watanabe.hw.hodaka.klock.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import watanabe.hw.hodaka.klock.R
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.concurrent.timer

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        private const val TAG = "MainFrag"
    }

    private lateinit var clockView: TextView
    private var clockScheduler: Timer? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.main_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clockView = view.findViewById(R.id.time)
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
        clockScheduler = timer(period = 1000) {
            clockView.post {
                clockView.text = currentTime()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
        clockScheduler?.cancel()
    }

    private fun currentTime() =
        DateTimeFormatter.ofPattern("HH:mm:ss").format(Instant.now().atZone(ZoneId.systemDefault()))
}
