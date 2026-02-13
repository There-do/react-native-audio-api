package com.swmansion.audioapi.system.notification.state

import android.content.Intent
import com.facebook.react.bridge.ReadableMap
import com.swmansion.audioapi.system.notification.RecordingNotificationReceiver

data class RecordingNotificationState(
  var receiver: RecordingNotificationReceiver? = null,
  var initialized: Boolean,
  var pauseIntent: Intent? = null,
  var resumeIntent: Intent? = null,
  var title: String? = null,
  var contentText: String? = null,
  var channelName: String = "Recording Audio",
  var channelDescription: String = "Notifications for ongoing audio recordings",
  var paused: Boolean = false,
  var pauseText: String = "Pause",
  var resumeText: String = "Resume",
  var smallIconResourceName: String? = null,
  var largeIconResourceName: String? = null,
  var backgroundColor: Int? = null,
  var cachedRNOptions: ReadableMap? = null,
  var darkTheme: Boolean,
)
