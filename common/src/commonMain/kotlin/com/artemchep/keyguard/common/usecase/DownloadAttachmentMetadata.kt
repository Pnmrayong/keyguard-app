package com.artemchep.keyguard.common.usecase

import com.artemchep.keyguard.common.io.IO
import com.artemchep.keyguard.common.model.DownloadAttachmentRequest
import com.artemchep.keyguard.common.model.DownloadAttachmentRequestData

interface DownloadAttachmentMetadata : (DownloadAttachmentRequest) -> IO<DownloadAttachmentRequestData>
