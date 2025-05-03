package org.fossify.arfoxphone.models

sealed class Events {
    data object RefreshCallLog : Events()
}
