package ro.upt.ac.chiuitter

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import ro.upt.ac.chiuitter.presentation.ComposeActivity

class GetChiuitResultContract : ActivityResultContract<Unit, String?>() {

    override fun createIntent(context: Context, input: Unit): Intent {
        // TODO 2: Create an explicit intent which points to ComposeActivity.
        val intent = Intent(context, ComposeActivity::class.java)

        return Intent()
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        if (resultCode == Activity.RESULT_OK && intent != null) {
            // TODO 5: Extract the text from result intent.
            val text = intent.getStringExtra(EXTRA_TEXT)
            return text
        } else {
            return ""
        }

    }

    companion object {
        const val EXTRA_TEXT = "extra_text"
    }
}