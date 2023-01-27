package com.study.study_springboots.utils;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public String getUniqueSequence() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    // "src/main/resources/static/files" -> root directory + 상대경로
    public String getRelativeToAbsolutePath(String relativePath) {
        // 윈도우 경로표시 = \\ 리눅스 경로표시 = /
        // File.separator - 리눅스면 리눅스에 맞는 경로, 윈도우면 윈도우에 맞는 경로로 바꿔준다.
        String relativePathWithSeparator = relativePath.replace("/", File.separator);
        // new File.getAbsoltePath() = 폴더의 절대 경로 가져옴
        String absolutePath = new File(relativePathWithSeparator).getAbsolutePath() + File.separator;
        return absolutePath;
    }
}
