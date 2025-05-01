package org.fossify.phone.activities

import org.fossify.commons.activities.BaseSimpleActivity
import org.fossify.phone.R

open class SimpleActivity : BaseSimpleActivity() {
    override fun getAppIconIDs() = arrayListOf(
        R.mipmap.ic_launcher
    )

    override fun getAppLauncherName() = getString(R.string.app_launcher_name)

    override fun getRepositoryName() = "Phone"
}
