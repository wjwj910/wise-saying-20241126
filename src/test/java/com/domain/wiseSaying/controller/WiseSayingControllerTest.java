package com.domain.wiseSaying.controller;

import com.standard.util.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {

    @Test
    @DisplayName("== 명언 앱 ==")
    public void t1(){
        Scanner scanner = TestUtil.getScanner("종료");
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        App app = new App(scanner);
        app.run();

        TestUtil.clearSetOutToByteArray(outputStream);

        assertThat(outputStream.toString())
                .contains("== 명언 앱 ==");

    }
}
