package org.fossify.arfoxphone.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.fossify.arfoxphone.activities.CallActivity
import org.fossify.arfoxphone.helpers.ACCEPT_CALL
import org.fossify.arfoxphone.helpers.CallManager
import org.fossify.arfoxphone.helpers.DECLINE_CALL

class CallActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            ACCEPT_CALL -> {
                context.startActivity(CallActivity.getStartIntent(context))
                CallManager.accept()
            }

            DECLINE_CALL -> CallManager.reject()
        }
    }
}
