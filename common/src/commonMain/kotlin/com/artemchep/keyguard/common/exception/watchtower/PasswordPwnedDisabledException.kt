package com.artemchep.keyguard.common.exception.watchtower

import com.artemchep.keyguard.common.model.NoAnalytics

class PasswordPwnedDisabledException : RuntimeException(), NoAnalytics
